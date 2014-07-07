package com.csst.business.dao.mysql.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.hibernate.Session;

import com.csst.business.dao.IUserMenuDao;
import com.csst.business.model.TUserMenu;
import com.csst.popular.api.MenuAPI;
import com.csst.popular.bean.BaseResult;
import com.csst.services.Thread.TokenThread;
import com.csst.services.common.WeixinUtil;
import com.csst.services.pojo.Button;
import com.csst.services.pojo.CommonButton;
import com.csst.services.pojo.ComplexButton;
import com.csst.services.pojo.Menu;
import com.csst.services.pojo.ViewButton;

public class UserMenuDaoImpl extends BaseDaoImpl implements IUserMenuDao {

	@Override
	public TUserMenu saveUserMenu(TUserMenu usermenu) {
		Session session=getSessionFactory().getCurrentSession();
		TUserMenu tt = new TUserMenu();
				session.saveOrUpdate(usermenu);
		return tt;
	}

	@Override
	public List<TUserMenu> findAllUserMenu() {
		Session session=getSessionFactory().getCurrentSession();
		StringBuffer sb=new StringBuffer();
		sb.append(" from TUserMenu t where 1=1 and t.type like '%自定义菜单%' order by t.usermenuNo");
		List<TUserMenu> list=session.createQuery(sb.toString()).list();
		return list;
	}

	@Override
	public boolean updateUserMenu() {
		boolean updateFlag=false;
		//获取所有的菜单
		List<TUserMenu> topMenuList = new ArrayList<TUserMenu>();
		List<TUserMenu> secondMenuList = new ArrayList<TUserMenu>();
		List<TUserMenu> list = findAllUserMenu();
		if(list.size()>0){
			for(int i = 0 ; i <list.size();i++){
				TUserMenu userMenu = list.get(i);
				if(userMenu.getUsermenuLeve()==1){
					topMenuList.add(userMenu);
				}else if(userMenu.getUsermenuLeve()==2){
					secondMenuList.add(userMenu);
				}
			}
		}
		Map<TUserMenu,List<TUserMenu>> buttamp = new HashMap<TUserMenu,List<TUserMenu>>();
		if(topMenuList.size()>0){
			for(int i =0;i<topMenuList.size();i++){
				TUserMenu tuserMenu =topMenuList.get(i);
				String menuId = tuserMenu.getId();
				List<TUserMenu> seclist = new ArrayList<TUserMenu>();
				if(secondMenuList.size()>0){
					for(int j =0;j<secondMenuList.size();j++){
						TUserMenu suserMenu = secondMenuList.get(j);
						if(suserMenu.getFkUmid().equalsIgnoreCase(menuId)){
							seclist.add(suserMenu);
						}
					}
				}
				buttamp.put(tuserMenu, seclist);
			}
		}
		Menu menu = new Menu();
		if(buttamp.size()>0){
			Button tbut[] = new Button[buttamp.size()];
			int dd=0;
			for (TUserMenu key : buttamp.keySet()) {
				 TUserMenu	tmenu = key;
				 List<TUserMenu> tlist = buttamp.get(key);
				 //有子菜单说明主菜单为ComplexButton，否则为ViewButton
				 if(tlist.size()>0){
					 ComplexButton mainBtn = new ComplexButton();
					 mainBtn.setName(tmenu.getUsermenuName());
					 Button but[] = new Button[tlist.size()];
					 for(int m=0;m<tlist.size();m++){
						 TUserMenu smenu = tlist.get(m);
						 CommonButton btn = new CommonButton();
						 btn.setKey(smenu.getUsermenuCode());
						 btn.setName(smenu.getUsermenuName());
						 btn.setType("click");
						 but[m]=btn;
					 }
					 mainBtn.setSub_button(but);
					 tbut[tmenu.getUsermenuNo()-1] = mainBtn;
				 }else{
					 ViewButton mainviewbtn = new ViewButton();  
					 mainviewbtn.setName(tmenu.getUsermenuName());  
					 mainviewbtn.setType("view");  
					 mainviewbtn.setUrl(tmenu.getUsermenuLink());
					 tbut[tmenu.getUsermenuNo()-1] = mainviewbtn;
				 }
				 dd++;
			}
			menu.setButton(tbut);
		}
		//获取accessToken
        String at = TokenThread.accessToken.getToken(); 
       //菜单创建
	    if (null != at) {  
	    	 MenuAPI menuAPI = new MenuAPI();
	          String jsonMenu = JSONObject.fromObject(menu).toString();
	            BaseResult br =  menuAPI.menuCreate(at, jsonMenu);
	          if("ok".equals(br.getErrmsg())){
	        	  updateFlag = true;
	          	 System.out.println("菜单创建成功！");  
	          }else{
	        	  System.out.println("菜单创建失败，错误码：" + br.getErrcode());  
	          }
	     }
		return updateFlag;
	}

	@Override
	public boolean deleteUserMenu(String menuId) {
		boolean isadd = false;
		Session session=getSessionFactory().getCurrentSession();
		String hql=" delete from TUserMenu t where t.id='"+menuId+"'";
		session.createQuery(hql).executeUpdate();
		return true;
	}

	@Override
	public boolean isAddMenuAjax(String id) {
		boolean isadd = false;
		Session session=getSessionFactory().getCurrentSession();
		StringBuffer sb=new StringBuffer();
		sb.append(" from TUserMenu t where 1=1 and t.type like '%自定义菜单%' and t.fkUmid='"+id+"'");
		List<TUserMenu> list=session.createQuery(sb.toString()).list();
		int menuLength = list.size();
		if(id.equals("0")){
			if(menuLength<3){
				isadd =true;
			}
		}else{
			if(menuLength<5){
				isadd =true;
			}
		}
		return isadd;
	}

	@Override
	public List<TUserMenu> getParentMenuById(String userMenuId) {
		Session session=getSessionFactory().getCurrentSession();
		StringBuffer sb=new StringBuffer();
		sb.append(" from TUserMenu t where 1=1 and t.type like '%自定义菜单%' and t.fkUmid='"+userMenuId+"'");
		List<TUserMenu> list=session.createQuery(sb.toString()).list();
		return list;
	}

	@Override
	public TUserMenu getUserMenuById(String userMenuId) {
		Session session=getSessionFactory().getCurrentSession();
		TUserMenu list=(TUserMenu) session.get(TUserMenu.class, userMenuId);
		return list;
	}

	@Override
	public boolean checkHaveChildsById(String id) {
		boolean flag = false;
		Session session=getSessionFactory().getCurrentSession();
		StringBuffer sb=new StringBuffer();
		sb.append(" from TUserMenu t where 1=1 and  t.fkUmid='"+id+"'");
		List<TUserMenu> list=session.createQuery(sb.toString()).list();
		if(list.size()>0){
			flag = false;
		}else{
			flag = true;
		}
		return flag;
	}

	
}

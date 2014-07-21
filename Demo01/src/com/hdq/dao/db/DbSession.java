package com.hdq.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSession {
	public static final String DBDRIVER = "oracle.jdbc.OracleDriver";
	public static final String DBURL="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static final String DBUSER="handq";
	public static final String DBPASS="handq";
	public Connection conn;
	public DbSession() {
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = this.getConnEction();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnEction() throws SQLException{
		return  DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	}
	
	public void close(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}

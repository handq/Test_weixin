package com.hdq.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Demo12 {
	
	public static void main(String[] args) {
		/*Double[] str = new Double[]{0.1, 0.9, 0.3, 0.5, 0.2, 0.4, 0.6, 0.12, 0.2, 0.34};
		//Arrays.fill(str,Math.random()); 
		System.out.println(Arrays.asList(str));
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println(Arrays.asList(str));*/
		
		Vector v = new Stack();
		List list = new Vector();
		List list1 = new Stack();
		//Set s   = new  HashSet<E>();
		SortedSet se = new TreeSet();
		se.add(1);
		se.add(3);
		se.add(2);
		se.add(4);
		System.out.println(Arrays.asList(se));
		List s = Arrays.asList(se);
		Collections.unmodifiableCollection(se);//创建只读集合
		Collections.unmodifiableList(list);//创建只读list
		//Collections.unmodifiableMap(m);//创建只读map
		//Collections.unmodifiableSet(s);//创建只读set
	}
}

package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		Point p01 = new Point(3,13);
		Point p02 = new Point(4,13);
		Point p03 = new Point(3,13);
		
//		System.out.println(p02.hashCode());
		
		Set <Point> pSet = new HashSet<>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet.size());
		for(Point p : pSet)
			System.out.println(p.toString());
		
		
		
	}

}

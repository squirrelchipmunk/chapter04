package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(13);
		Integer i06 = new Integer(17);
		
		Set <Integer> iSet = new HashSet<>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		iSet.add(i05);
		iSet.add(i06);
		
		iSet.remove(i05);
		System.out.println("갯수: "+iSet.size());
		for(Integer no : iSet) {
			System.out.println(no.toString());
		}
		System.out.println(iSet.toString());
		System.out.println();
		
		//Point
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,103);
		Point p03 = new Point(5,20);
		Point p04 = new Point(31,13);
		
		Set<Point> pSet = new HashSet<>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);

		pSet.remove(p01);
		System.out.println("갯수: "+pSet.size());
		for(Point p : pSet) {
			System.out.println(p.getX());
		}
		System.out.println(pSet.toString());
	}

}

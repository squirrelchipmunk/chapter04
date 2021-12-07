package com.javaex.ex04;

import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		Point p01 = new Point(2,12);
		Point p02 = new Point(3,13);
		Point p03 = new Point(7,17);
		
//		List <Point> pList = new ArrayList<>();
		List <Point> pList = new LinkedList<>();
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//갯수 출력
		System.out.println(pList.size());
		
		//관리되고 있는 Point 접근
		System.out.println(pList.get(1).getY());
		System.out.println(pList.get(1).toString());
		System.out.println();
		
		//전체 출력하기
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println();
		
		//데이터 지우기
		//pList.remove(1);
		pList.remove(p02);
		System.out.println(pList.size());
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println();
		
		pList.add(1, p02);
		for(int i=0;i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println();
		
		System.out.println(pList.toString());
		System.out.println();
		
		///향상된 for문
		for(Point p : pList) {
			System.out.println(p.getX());
		}
		
		
		
		
		
	}

}

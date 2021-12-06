package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		Point p01 = new Point(4,7);
		Point p02 = new Point(8,17);
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(19);
		

		// Point 관리
//		MyList pList = new MyList();
		MyList <Point> pList = new MyList<>();
		pList.add(p01);
		pList.add(p02);
		System.out.println(pList.get(0).toString());
		System.out.println(pList.toString());
		System.out.println(pList.get(0).getX());	// Object로 관리할 때는 접근 불가

		
		System.out.println();

		// Circle 관리
//		MyList cList = new MyList();
		MyList <Circle> cList = new MyList<>();
		cList.add(c01);
		cList.add(c02);
		System.out.println(cList.get(0).toString());
		System.out.println(cList.toString());
		System.out.println(cList.get(0).getRadius()); // Object로 관리할 때는 접근 불가
	


	}
}

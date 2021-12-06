package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {

	private Circle[] cList;
	private int capacity;
	
	public CircleList() {
		cList = new Circle[3];
		capacity = 0;
	}
	
	public void add(Circle c) {
		cList[capacity] = c;
		capacity++;
	}
	
	public Circle get(int index) {
		
		Circle c = cList[index];
		return c;
	}
	
	
	
	@Override
	public String toString() {
		return "CircleList [cList=" + Arrays.toString(cList) + ", capacity=" + capacity + "]";
	}

	public int size() {
		return capacity;
	}
	
	
	
}

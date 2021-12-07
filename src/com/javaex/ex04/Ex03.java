package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		//HashSet을 이용해 로또 자동 생성
		
		Set <Integer> lotto = new HashSet<>();
		Integer no;
		
		while(lotto.size() <6) {
			no = (int)(Math.random()*45)+1;
			lotto.add(no);
		}
		
		for(Integer i : lotto) {
			System.out.print(i+" ");
		}
	}

}

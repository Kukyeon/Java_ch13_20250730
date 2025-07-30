package com.kkuk.ch13.part01.settest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		
		// ** set 은 중복 제거 **  size() 저장된 객체수를 리턴 ** 
		//   ** iterator<E> 저장된 객체를 한번씩 가져오는 반복자를 리턴 **
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Kor");
		set1.add("Jap");
		set1.add("China");
		set1.add("USA");
		
		System.out.println(set1.size()); // set1 에 들어간 총 객체 수 = 4 
			
		set1.add("Jap");
		set1.add("China");
		set1.add("Rusia");
		
		System.out.println(set1.size()); // set 은 중복을 걸러줘서 총 값은 = 5
		
		  // set1 전용의 iterator 생성
		
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()) { // hasNext -> 다음 요소를 가져옴
			// 다음 set 객체가 존재하면 true ,  없으면 false 
			String setstr = iter.next(); // set 객체를 꺼내고 iterator 이동
			System.out.println(setstr);
		}
		System.out.println("--------------------------------");
		
		for (String setstr : set1) { // 향상된 for 문
			System.out.println(setstr);
		}
		
		System.out.println("--------------------------------");
		
		// set1.clear(); // <- 모든 요소 삭제
		
		
		for (String setstr : set1) { // 향상된 for 문 / 안에 요소 확인
			System.out.println(setstr);
	}
		if(set1.isEmpty()) {
			System.out.println("비어잇습"); // true
		}else {
			System.out.println("비어잇지않음"); // false
		}
}
	
}

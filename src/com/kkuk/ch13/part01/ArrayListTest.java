package com.kkuk.ch13.part01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList<String>(); // 객체를 저장할수있는 박스 생성
		
		strList.add("Kor");
		strList.add("Jap"); //(string) 인덱스 0 부터 순차 적용
		strList.add(1, "USA");  // (index , string) 1번 인덱스에 usa 를 삽입
		
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		
		System.out.println("===================================");
		strList.remove(1); // usa 인덱스 1 , / 정해진 인덱스값에 내용을 빼줌
		
		System.out.println(strList.get(0)); // kor
		System.out.println(strList.get(1));	// jap
		//System.out.println(strList.get(2)); // 비어있음 에러발생
	}

}

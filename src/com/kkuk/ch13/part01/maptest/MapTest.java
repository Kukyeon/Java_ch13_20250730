package com.kkuk.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// Map 은 키 Key 와 벨류 Value 로 이루어짐
		// 보통 Key 값은 String 을 많이 쓰며 , Value 값은 다양 
		Map<String, String> map1 = new HashMap<String, String>(); // 정수넣고싶은데 int 안들어가지면 Integer
		
		map1.put("이름", "홍길동"); // -> 데이터 삽입
		map1.put("직업", "개발자"); // -> 데이터 삽입
		map1.put("성별", "남 자"); // -> 데이터 삽입
		
		System.out.println(map1);
		
		System.out.println("-------------------------------");
		
		System.out.println(map1.get("이름")); // Key 값으로  Value 추출
		System.out.println(map1.get("직업")); // key 값은 중복이 안됨
		System.out.println(map1.get("성별")); // 각 개체값에 대해 명시가 되어있어서 명확한 값 저장 
		
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		// 쉽게 객체값 구하기 쉬움
		map2.put("홍길동", 90);
		map2.put("이순신", 80);
		map2.put("김유신", 70);
		map2.put("강감찬", 75);
		
		
		map2.put("강감찬", 85); // 강감찬의 점수가 85점으로 수정됨
		
		System.out.println(map2);
		System.out.println("-------------------------------");
	}

}

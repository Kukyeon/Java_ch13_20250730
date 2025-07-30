package com.kkuk.ch13.part01.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashtableTese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  로그인 과정 구현
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tiger", "12345"); //id . pw
		map.put("lion", "78945");
		map.put("blackcat", "78745");
		map.put("whitedog", "75147");
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 아이디 : ");
		 	String id = scanner.nextLine();
		 	
		 	System.out.println(" 비밀번호 : ");
		 	String pw = scanner.nextLine();
		 	
		 	System.out.println("----------------------------------------");
		 	
		 	if(map.containsKey(id)) { // containsKey() key 값중에 일치여부 확인 메소드
		 		// map 에 들어온 데이터 key 값중, id 값과 일치하는 값이 존재하면 true
		 		if(map.get(id).equals(pw)) {
		 			System.out.println(" 로그인성공 ");
		 			break;
		 		}else { // 아이디 값은 존재하나 해당 id 의 비밀번호가 다름
		 			System.out.println(" 비밀번호가 틀렸습니다. ");
		 		}
		 	} else {
		 		System.out.println(" 아이디가 존재하지 않습니다. ");
		 	}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

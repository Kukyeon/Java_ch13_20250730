package com.kkuk.ch13.part02;

import java.util.Stack;

public class StackQuiz02 {

	public static void main(String[] args) {
		//  ((()() -> 유호한 괄호인지 아닌지 출력하는 프로그램

		
		String str = "(((()((())";
		
		
		Stack<Character> strStack = new Stack<Character>();
				
		 for(int i = 0 ; i < str.length() ; i++) {
	        	char ch = str.charAt(i);   // 문자열에서 한글자씩 추출
	        
	        if(ch == '(') {
	        	strStack.push(ch);	
	        } else { // else 일때 ) 이게 들어옴
	        	if(strStack.isEmpty()) {
	        		System.out.println("유효하지 않은 괄호 구성입니다.");
	        		return;
	        	}
	        	strStack.pop(); // 들어온 ) 의 짝이 추출
	        }
	        	
	        if(strStack.isEmpty()) {
	        	System.out.println("유효한 괄호 구성입니다.");
	        }else {
	        	System.out.println("유효하지 않은 괄호 구성입니다.");
	        }
		 
		 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

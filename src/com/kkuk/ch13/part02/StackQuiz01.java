package com.kkuk.ch13.part02;

import java.util.Stack;

public class StackQuiz01 {

	public static void main(String[] args) {
		// ** stack 사용하여 문자열 뒤집기 **  Hello 문자열을 거꾸로 출력하시오오오오오 ex : olleH
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("H");
		stack.push("e");
		stack.push("l");
		stack.push("l");
		stack.push("o");
		
		
		while(!stack.isEmpty()) { // isEmpty() -> stack 이 비어있으면 true 가 나옴 
			// ! (not) 을 붙여서 비어있지않으면 실행
			String str =  stack.pop();  // 선입 후 출 < 마지막에 넣은게 가장 먼저 나옴 
			System.out.println(str);
		}
		
		
		
			System.out.println("------------------------------");
		

			
			String input = "Hello";
	        Stack<Character> stack1 = new Stack<Character>();

	        for (char ch : input.toCharArray()) {
	            stack1.push(ch);
	        }
	        
//	        for(int i = 0 ; i < input.length() ; i++) {
//	        	char ch = input.charAt(i);   // 같은 방식의 for 문
//	        }
//	        

	        while (!stack1.isEmpty()) {
	            System.out.println(stack1.pop());
	        }
	

}
}
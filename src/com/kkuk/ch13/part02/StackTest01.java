package com.kkuk.ch13.part02;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack1 = new Stack<String>(); // stack 은 class 임
		
		stack1.push("1) kor");
		stack1.push("2) jap");
		stack1.push("3) usa");
		
		
		while(!stack1.isEmpty()) { // isEmpty() -> stack 이 비어있으면 true 가 나옴 
			// ! (not) 을 붙여서 비어있지않으면 실행
			String str =  stack1.pop();  // 선입 후 출 < 마지막에 넣은게 가장 먼저 나옴 
			System.out.println(str);
		}
		
	}

}

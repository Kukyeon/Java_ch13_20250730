package com.kkuk.ch13.part02;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Coin> coinBox = new Stack<Coin>();
		// coin 클래스로 만든 객체만 들어올수있는 stack 컬렉션 coinBox 선언
		
		
		coinBox.push(new Coin(100)); // 100원짜리 1개 생성 -> coinBox 에 삽입
		coinBox.push(new Coin(500)); // 500원짜리 1개 생성 -> coinBox 에 삽입
		coinBox.push(new Coin(100)); // 100원짜리 1개 생성 -> coinBox 에 삽입
		coinBox.push(new Coin(50)); // 50원짜리 1개 생성 -> coinBox 에 삽입
		coinBox.push(new Coin(500)); // 500원짜리 1개 생성 -> coinBox 에 삽입
		
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // coinBox 에서 동전 빼기
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		
	}

}

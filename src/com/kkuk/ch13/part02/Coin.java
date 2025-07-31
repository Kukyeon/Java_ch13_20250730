package com.kkuk.ch13.part02;

public class Coin {

	private int value; // 동전액면 가격 -> 50원 100원 500원

	public Coin(int value) {
		super();
		this.value = value;
	}

	public Coin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}

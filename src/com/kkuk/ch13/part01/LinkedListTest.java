package com.kkuk.ch13.part01;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Board> list1 = new ArrayList<Board>(); // array
		List<Board> list2 = new LinkedList<Board>(); // linked
		
		Date nowDate = new Date();
		
		Board board = new Board("흔 글", "안녕하세요", "하이요 첫글이에요", new Timestamp(nowDate.getTime()));
		
		long startTime; // 작업시작시간
		long endTime;	 // 작업종료시간
		
		
		// ArrayList 작업 시간 측정
		startTime = System.nanoTime();
		for(int i = 0 ; i < 100000 ; i++) { // 10000번 board 객체 삽입
			list1.add(board);
		}
			endTime = System.nanoTime();
			System.out.println("arraylist 작업시간 : " + (endTime - startTime));
		
			
			
			
		// LinkedList 작업 시간 측정
		startTime = System.nanoTime();
		for(int i = 0 ; i < 100000 ; i++) { // 10000번 board 객체 삽입
			list2.add(board);
		}
			endTime = System.nanoTime();
			System.out.println("linkedlist 작업시간 : " + (endTime - startTime));
		
		
		
	}

}

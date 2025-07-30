package com.kkuk.ch13.part01;

import java.awt.BorderLayout;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Board> boardlist = new ArrayList<Board>();
		Date nowDate = new Date();
		
		
		Board board1 = new Board();
		board1.setWriter("남궁길동");  // 세터 갖다쓰는방식
		board1.setSubject("남궁신화");
		board1.setContent("남궁신화가 태어난 내용");
		board1.setDate(new Timestamp(nowDate.getTime()));
		
		boardlist.add(board1);
		
		boardlist.add(new Board("남궁길길동", "남궁신화", "남궁신화가 태어난 내용", new Timestamp(nowDate.getTime())));
		
		Board board2 = new Board("남궁길길길동", "남궁신화", "남궁신화가 태어난 내용", new Timestamp(nowDate.getTime()));
		
		boardlist.add(board2);
		
		 System.out.println(" 제  목 /     글 내 용      /  글 쓴 이  /   작 성 날 자 ");
		 System.out.println("---------------------------------------------------");
		for(int i=0 ; i < boardlist.size() ; i++) {
			// arraylist 길이는 size로 선택
			 Board board = boardlist.get(i);
			 System.out.println(board.getSubject() + " / " + board.getContent() + " / " + board.getWriter() + " / " + board.getDate());
		}
		
	}

}

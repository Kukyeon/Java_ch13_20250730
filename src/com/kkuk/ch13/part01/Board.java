package com.kkuk.ch13.part01;

import java.sql.Timestamp;

public class Board {
	// 글 한개를 저장하는 객체 -> 글 한개(글쓴이, 글제목, 글내용, 글쓴날자)
	// Dto 클래스(Vo 클래스)
	
	private String writer; // 글쓴이
	private String subject; // 글 제목
	private String content; // 글 내용
	private Timestamp date; // 글 쓴 날자
	
	// 생성자 2개 겟터 셋터 
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(String writer, String subject, String content, Timestamp date) {
		super();
		this.writer = writer;
		this.subject = subject;
		this.content = content;
		this.date = date;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Timestamp getDate() {
		return date;
	}
	
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	
	
	
	
}

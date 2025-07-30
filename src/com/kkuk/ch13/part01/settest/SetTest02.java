package com.kkuk.ch13.part01.settest;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<MemberDto> set = new HashSet<MemberDto>();
		
		MemberDto member1 = new MemberDto(" tiger ", "123123" , "김또깡", 21);
		
		set.add(member1);
		set.add(member1);
		set.add(member1);
		set.add(member1);
		
		
		System.out.println(set.size()); // = 1 -> 중복 허용 X
		
		
		
		
	}

}

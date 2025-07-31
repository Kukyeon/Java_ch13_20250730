package exex;

import java.util.Iterator;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MemberDao member = new MemberDao();
		List<MemberDto> dto = member.getMemberList();
		
		
		Iterator<MemberDto> iter = dto.iterator();
		
		while(iter.hasNext()) {
			MemberDto mem = iter.next();
			System.out.println(" 아이디 / 비밀번호 / 이름 / 이메일");
			System.out.println(mem.getId() + "/" + mem.getPw() + "/" + mem.getName() + "/" + mem.getEmail());
			
		}
		
		
		
		
		
		
		
	}

}

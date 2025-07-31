package exex;

import java.util.Iterator;
import java.util.List;

import com.kkuk.ch13.part01.Board;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BoardDao dao = new BoardDao();
		List<exex.Board> boardList = dao.getBoardDao();
		
		
		Iterator<exex.Board> iterator = boardList.iterator();
		while(iterator.hasNext()) {
				exex.Board board = iterator.next();
				System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}

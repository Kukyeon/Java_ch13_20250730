package exex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고점수 아이디가 저장될 변수
		int maxScore = 0; // 최고 점수가 저장될 변수
		int totalScore = 0; // 점수의 총합이 저장딜 변수
		
		Set<Map.Entry<String, Integer>> entset = map.entrySet();
		
		
		for(Map.Entry<String, Integer> entry : entset) {
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue(); // 최고 점수를 max 에 넣음
				name = entry.getKey(); // key값 으로 id 값 가져오기
				// 마지막으로 if 조건문이 참인 시점 -> 최고값으로 max 값이 바뀌는 시점
				// 마지막으로 if 조건문이 참인 시점 -> key 값은 max 값의 주인인 id 값
				
			}totalScore = totalScore + entry.getValue(); // 총점수
		}
		System.out.println("최대점수 : " + maxScore);
		System.out.println("평균점수 : " + totalScore / map.size());
		System.out.println("이름 : " + name);
		
		
		
	}

}

package ex;

import java.util.*;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , String> map2 = new HashMap<>();
		
		map2.put("첫번째","Java");
		map2.put("두번째","Mysql");
		map2.put("세번째","Spring");
		
		System.out.println(map2.get("두번째"));
		
		map2.remove("세번째");
		
		System.out.println(map2.get("세번째"));
		
		
				
		//map 반복문으로 접근
		for(String key: map2.keySet()) {
			System.out.println(key); // key 값 확인
			System.out.println(map2.get(key)); //value 값 확인			
			
		}
		Map<Integer, String> map1 = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		
		map1.put(1, "안녕하세요");
		map1.put(2, "감사해요");
		map1.put(3, "잘있어요");
		map1.put(4, "다시만나요");
		
		String vall = map1.get(1);
		System.out.println(vall);
		
		for(int key:map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
		}
		
	}

}

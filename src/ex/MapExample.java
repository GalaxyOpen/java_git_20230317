package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map = key + value (찾을 때는 key를 기준으로 value를 찾음)
		//key : 우리 마음대로 지정이 가능(String으로 주든 int로 주든 지정 가능)
		Map<Integer, String> map1 = new HashMap<>();
		// 좌변인 Map은 인터페이스<key> 타입, 우변인 HashMap은 클래스<value> 타입의 생성자 선언. 
		List<String> list1 = new ArrayList<>();
		//어떤 타입의 key를 쓸 것인지도 정해야함. 그래서 변수가 2개(integer, String) 
        // 주요 메소드
		// put, get, remove
		// put = 메소드 추가 put(key값, value값)
		// get = 값을 가져올 때 get(key)값
		// remove = 삭제할 때, remove key
		//CRUD = C (Create) = 저장 R(Read) = 읽기 u(수정)=(Update) D(delete)=저장
 		//method 
		// 접근제한자 : 리턴타입 methodType // 실행내용
		map1.put(1, "안녕하세요");
		System.out.println(map1.put(2, "hello"));
		System.out.println(map1.put(2, "ㅎㅎㅎㅎㅎㅎ"));
		System.out.println(map1.get(2));
		
		String vall = map1.get(1);
		System.out.println(vall);
		
		map1.remove(2);
		System.out.println(map1.get(2));
		
	}
}
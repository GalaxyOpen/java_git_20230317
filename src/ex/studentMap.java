package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, StudentDTO> map = new HashMap<>();
		
		StudentDTO s1 = new StudentDTO();
		
		s1.setStudentNumber("1111");
		s1.setStudentName("김자바");
		s1.setStudentMajor("컴퓨터공학");
		s1.setStudentMobile("010-1111-1111");
		map.put(1,s1);
		
		StudentDTO s2 = new StudentDTO();
		
		s2.setStudentNumber("2222");
		s2.setStudentName("이자바");
		s2.setStudentMajor("경영학");
		s2.setStudentMobile("010-2222-2222");
		map.put(2,s2);
		
		StudentDTO s3 = new StudentDTO();
		
		s3.setStudentNumber("3333");
		s3.setStudentName("박자바");
		s3.setStudentMajor("전자공학");
		s3.setStudentMobile("010-3333-3333");
		map.put(3,s3);
       
		
		
		
		System.out.println("id\t학번\t이름\t전공\t전화번호");
		System.out.println("=====================================================");
		for(int key:map.keySet()) {
			
			System.out.println(key+"\t"+map.get(key).toString());
					
			
		}		

	}

}

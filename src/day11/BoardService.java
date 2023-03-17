package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardService {
//BoardService:데이터  //출력담당

	// 서비스에선 레퍼를 호출해야되므로 레퍼지 객채가 필요하다
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	// 세이브에서 데이터를 받아야된다 스캐너
	// 보드라는 객체는 레퍼지의 리스트에 저장되야된다 -->메소드를 통해서 저장해야됨
	public void save() {
		BoardDTO boardDTO = new BoardDTO(); // 보드디티오의메소드를 실행하고싶어서 객체를만든다
		System.out.println("제목> ");
		boardDTO.setTitle(sc.nextLine());// 보드디티오의 셋타이틀메소드를실행한다
		System.out.println("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		
		

		boolean success = br.save(boardDTO, boardDTO.getBno());
		if (success = true) {
			System.out.println("게시글 등록완료!");
		} else {
			System.out.println("게시글 등록실패");
		}

	}

	// 파인드올에서 레퍼지에있는 메소드를 통해 리스ㅊㅌ를 가지고와서 출력해주고싶다
	public void findAll() {
		Map<String, BoardDTO> map = br.findAll();
		
		List<String> kS = new ArrayList<>(map.keySet());
		//Collections.sort(kS, Collections.reverseOrder()); //내림차순
        Collections.sort(kS); // 오름차순

		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("----------------------------------------------------------");
        
		for (String key:kS) {
			map.get(key).print();
		}
		}
	

	// 레퍼지토리에서 데이터를 가직오ㅘ서 서비스에서 출력할거임
	// 레퍼지토리에서 호출할때 데이터를 가지고와야된다

	public void findById() {
		System.out.println("읽을 번호> ");
		String bno = sc.next();
		BoardDTO boardDTO = br.findById(bno); // 입력받고 레퍼지토리 findById 메소드를 호출할때 bno를 repository에 넘겨줌
		// 넘겨받은 bno 를 가지고 레퍼지에있는 메소드에서 리스트안에 비엔오랑 넘겨받은 비엔오랑 같은게 있으면 비를 리턴 없으면 null을
		// 리턴한다.
		// 레퍼지에서 비엔오가 같으면 DTO를 받아서 서비스에서 출력시켜준다
		
		if (boardDTO == null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			boardDTO.increaseCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
			System.out.println("----------------------------------------------------------");
			boardDTO.print();
		}
		
	}

	public void update() {
        
		// 레퍼지토리에서 아이디가 있는지 확인하고 삭제할 거다
		System.out.println("수정할 글번호> ");
		String bno = sc.next(); // 검색 기준을 bno로 잡는 이유는 고유한 값이기 때문이다. 
		sc.nextLine();
		BoardDTO b = br.findById(bno);
		// 파인드바이 아이디 메소드가 실행된후 비에 받으면 값은 Null 또는 객체가 들어있다
		if (b == null) {
			System.out.println("조회할 수 없는 글번호입니다");
		} else {

//			BoardDTO boardDTO = new BoardDTO();
			System.out.println("수정할 제목> ");
//			boardDTO.setTitle(sc.nextLine());
			String updateTitle = sc.nextLine();
			System.out.println("수정할 작성자> ");
//			boardDTO.setWriter(sc.next());
			String updateWriter = sc.nextLine();
			BoardDTO boardDTO = new BoardDTO(updateTitle,updateWriter);
			
			sc.nextLine();
//			if (br.updateNew(bno, updateTitle, updateWriter)) 
			if(br.update(boardDTO, bno)){
				// 레퍼지안에서 어떤걸 수정할지 알아야하니까 bno를 매개변수로 넘겨줌
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}

		}

	}

	public void delete() {
		System.out.println("삭제할 글번호> ");
		String bno = sc.next();
		sc.nextLine();
		BoardDTO b = br.findById(bno);

		if (b == null) {
			System.out.println("조회할 수 없는 글번호입니다");
		} else {
			BoardDTO boardDTO = new BoardDTO();

			if (br.delete(boardDTO, bno)) {
				// 레퍼지안에서 어떤걸 수정할지 알아야하니까 bno를 매개변수로 넘겨줌
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}

	}

//다른 풀이
//	public void delete() {
//		System.out.println("삭제할 글번호> ");
//		String bno = sc.next();sc.nextLine();
//		if(br.delete(bno)) {
//			System.out.println("삭제완료");
//		}else {
//			System.out.println("삭제성공");
//		}
//	}
    public void testdata() {
    	
//    	BoardDTO test1 = new BoardDTO("1111", "1111");
//    	BoardDTO test2 = new BoardDTO("2222", "2222");
//    	BoardDTO test3 = new BoardDTO("3333", "3333");
//    	BoardDTO test4 = new BoardDTO("4444", "4444");
//    	BoardDTO test5 = new BoardDTO("5555", "5555");
//    	
//    	br.save(test1, test1.getBno());
//    	br.save(test2, test2.getBno());
//    	br.save(test3, test3.getBno());
//    	br.save(test4, test4.getBno());
//    	br.save(test5, test5.getBno());    	
    	
    	for(int i=1; i<=5; i++) {
    	BoardDTO test = new BoardDTO();
    	test.setTitle("title"+i);
    	test.setWriter("writer"+i);
    	br.save(test,test.getBno());
    	
    	
    	}
    	System.out.println("test데이터 입력 완료");
    }
    public void index() {
    	System.out.println("검색할 작성자를 입력하세요");
    	String searchWriter = sc.next();sc.nextLine();
    	List<BoardDTO> boardDTO = br.index(searchWriter);
    	
    	if(boardDTO.size()==0) {
    		System.out.println("검색된 작성자가 없습니다.");
    	}
        System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
        for(BoardDTO b : boardDTO) {
        	b.print();
        }

    	
    	
    	
    	
    
    }
}

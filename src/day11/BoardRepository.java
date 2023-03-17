package day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepository {
//BoardRepository:데이터를 DB에 저장하는 역할 

	Map<String, BoardDTO> boardmap = new HashMap<>();
	// 클래스가 다른클래스에 데이터를 주고받을때 사용하는 것은 메소드를 통해서 하면된다
	// 메인 -> 서비스 ->레퍼지토리의 순서대로 데이터를 호출시켜야된다

	// 서비스에서 데이터를 넘겨받아야되니까 매개변수가 필요하다
	public boolean save(BoardDTO boardDTO, String bno) {
//		boardmap.put(boardDTO.getBno(),boardDTO);
		
		BoardDTO result = boardmap.put(boardDTO.getBno(),boardDTO);
		if(result == null) {
		
		return true; // 리턴값은 불린값으로 나온다
		}else {
			return false;
		}
		
		
		// 리스트의 에드메소드를 실행함
		// 에드 메소드 자체를 리턴을 할수 없으니 리턴타입에 맞게 트루 또는 펄스로 리턴한다

	}

	// findall이란 메소드는 서비스에서 호출함 서비스는 리스트를 가져가야되니까 리턴타입은 리스트로 해야된다
	public Map<String, BoardDTO> findAll() {
		return boardmap;
	}

	public BoardDTO findById(String bno) {
		/*map 반복문 돌리고
		 * bno 와 일치하는 객체를 찾고
		 * 찾으면 리턴
		*/
		for (String key:boardmap.keySet()) {
			if (bno.equals(boardmap.get(key).getBno())) {
				
				// 2. b.increaseCnt();
				return  boardmap.get(key); // 메소드가 호출되서 실행되다 리턴을 만나면 메소드를 빠져나간다
			}
		}
		return null;
	}

	// 수정할 제목과 작성자는 매개변수로 받은 보드 디티오안에 있다
	public boolean update(BoardDTO boardDTO, String bno) {

		for (String key:boardmap.keySet()) {
			if (bno.equals(boardmap.get(key).getBno())) {
				boardmap.get(key).setTitle(boardDTO.getTitle());
				boardmap.get(key).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false; // 이프안에 안 들어왔으면 false이다
	}
	
	public boolean updateNew(String bno, String updateTitle, String updateWriter) {
		for (String key:boardmap.keySet()) {
			if (bno.equals(boardmap.get(key).getBno())) {
				boardmap.get(key).setTitle(updateTitle);
				boardmap.get(key).setWriter(updateWriter);
				return true;
			}
		}
		return false; // 이프안에 안드러왔으면 false이다
	}


	
	public boolean delete(BoardDTO BoardDTO, String bno) {

		for (String key:boardmap.keySet()) {
			if (boardmap.get(key).getBno().equals(bno)) {
				boardmap.remove(key);
				return true;
			}
		}
		return false;

	}
	
	
	
	//다른 풀이
	//삭제메소드는 매개변수를 비엔오만 받아도된다 수정할게 없고 삭제만 하는거니깐 

//	public boolean delete(String bno) {
//
//		for (BoardDTO b : list) {
//			if (b.getBno().equals(bno)) {
//				list.remove(b);
//				return true;
//			}
//		}
//		return false;
//
//	}
	public List<BoardDTO> index(String searchWriter) { // List<BoardDTO>를 돌려줄 예정
		ArrayList<BoardDTO> List = new ArrayList<>(); //searchWriter가 같은 객체만 모을 리스트
		ArrayList<String> search = new ArrayList<>(boardmap.keySet()); // BoardMap의 키 값으로 정렬할 리스트
		search.sort(Comparator.naturalOrder()); // search 리스트를 정순으로 정렬하겠다. 
		for (String m : search) {
			if(boardmap.get(m).getWriter().equals(searchWriter)) {
				
				List.add(boardmap.get(m));
			}
		}
		return List;

	}
	
}

	
	
	





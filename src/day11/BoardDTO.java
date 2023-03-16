package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
	// BoardDTO : 데이터를 담아놓는 클래스로 사용할거다
	//dto의 장점: 여러개의 데이터들을 하나로 묶어준다

	private static int number = 100;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss"); // final은 상수(변하지 않는
																									// 값)

	private String bno; // 게시글 번호 ->를 자동으로 쓰기위해(사용자가 직접 입력하는것이 아니도 보드객체가 생성될때 자동으로 입력하게 하기 위해) static
						// number을 사용한다
	private String title;
	private String writer;
	private int cnt; // 조회수
	private String postDate; // 게시 날짜

	public BoardDTO() {
		this.bno = "B" + number++;
		this.postDate = DTF.format(LocalDateTime.now());

	}
	
	

	public BoardDTO(String updatetitle, String updatewriter) {
		
		this.title = title;
		this.writer = writer;
	}
	public BoardDTO(String writer) {
		this.bno = "B" + number++;
		this.postDate = DTF.format(LocalDateTime.now());
		this.title = title;
		this.writer = writer;
	}


	public String getBno() {
		return bno;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCnt() {
		return cnt;
	}

 //실행되면 cnt에 1추가 시켜주는 메소드	
 //cnt는 우리가 입력 받는 것이 아니라서 setCnt가 필요가 없다
	public void increaseCnt() {
		this.cnt++;
	}

	public String getPostDate() {
		return postDate;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\t%d\t%s\n",bno,title,writer,cnt,postDate);
	}
	
	
}

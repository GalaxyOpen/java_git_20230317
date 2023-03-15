package day8;

import java.util.*; //*은 모든 것 이라는 뜻 자바의 util에 있는 모든 것을 사용한다


public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Member> list = new ArrayList<>(); // list.add(객체); list.get(index);
		int id = 0;
		
		while(true) {
			System.out.println("1.멤버등록 2.멤버리스트 3.검색 4.멤버수정 5.멤버삭제 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Member member = new Member();
				member.setId(++id);
				System.out.print("이메일입력> ");
				member.setEmail(sc.next());
				System.out.print("비밀번호입력> ");
				member.setPw(sc.next());
				System.out.print("이름입력> ");
				member.setName(sc.next());
				list.add(member);
				System.out.println("멤버등록 완료!");
			}else if(menu == 2) {
				System.out.println("아이디\t이메일\t\t비밀번호\t이름\t가입일");
				System.out.println("---------------------------------------------");
				for(Member m : list) {
					m.print();
				}
			}else if(menu == 3) {
				System.out.print("검색할id> ");
				int searchId = sc.nextInt();
				boolean find = false;
				System.out.println("아이디\t이메일\t\t비밀번호\t이름\t가입일");
				System.out.println("---------------------------------------------");
				for(Member m : list) {
					if(m.getId() == searchId) {
						m.print();
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 id입니다");
				}
			}else if(menu == 4) {
				System.out.print("수정할 id> ");
				int updateId = sc.nextInt();
				boolean find = false;
				for(Member m : list) {
					if(updateId == m.getId()) {
						System.out.print("수정할 이메일입력> ");
						m.setEmail(sc.next());
						System.out.print("수정할 비밀번호입력> ");
						m.setPw(sc.next());
						System.out.print("수정할 이름입력> ");
						m.setName(sc.next());
						System.out.println("수정완료!");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 id입니다");
				}
			}else if(menu == 5) {
				System.out.print("삭제할 id> ");
				int deleteId = sc.nextInt();
				boolean find = false;
				for(Member m : list) {
					if(deleteId == m.getId()) {
						System.out.println(m.getName()+"님 삭제완료");
						list.remove(m);
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 id입니다");
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}

}

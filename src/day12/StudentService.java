package day12;

import java.util.*;

public class StudentService {
	StudentRepository repository = new StudentRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름> ");
		studentDTO.setName(sc.next());
		System.out.print("국어> ");
		studentDTO.setKor(sc.nextInt());
		System.out.print("영어> ");
		studentDTO.setEng(sc.nextInt());
		System.out.print("수학> ");
		studentDTO.setMat(sc.nextInt());
		studentDTO.setGrade();
		if (repository.save(studentDTO)) {
			System.out.println("등록 성공!");
		} else {
			System.out.println("등록 실패");
		}
	}

	public void findAll() {
		List<StudentDTO> list = repository.findAll();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------------------");
		for (StudentDTO s : list) {
			System.out.println(s.toString());
		}
	}

	public void findById() {
		System.out.print("조회할 학번> ");
		String sno = sc.next();
		StudentDTO studentDTO = repository.findById(sno);

		if (studentDTO == null) {
			System.out.println("조회할 수 없는 학번입니다");
		} else {
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("-----------------------------------------------------------");
			System.out.println(studentDTO.toString());
		}
	}

	public void update() {
		System.out.print("수정할 학번> ");
		String sno = sc.next();

		StudentDTO studentDTO = repository.findById(sno);
		if (studentDTO == null) {
			System.out.println("조회할 수 없는 학번입니다");
		} else {
			System.out.print("수정할 이름> ");
			studentDTO.setName(sc.next());
			System.out.print("수정할 국어> ");
			studentDTO.setKor(sc.nextInt());
			System.out.print("수정할 영어> ");
			studentDTO.setEng(sc.nextInt());
			System.out.print("수정할 수학> ");
			studentDTO.setMat(sc.nextInt());
			if (repository.update(sno, studentDTO)) {
				System.out.println("수정완료");
			} else {
				System.out.println("수정실패");
			}
		}

	}

	public void delete() {
		System.out.println("삭제할 학번> ");
		String sno = sc.next();
		if (repository.delete(sno)) {
			System.out.println("삭제완료");
		} else {
			System.out.println("조회할 수 없는 학번입니다");
		}
	}

}

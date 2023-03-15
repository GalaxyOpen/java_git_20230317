package day11;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

	List<UserDTO> list = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}

	public boolean loginCheck(String email, String password) {
		for (UserDTO u : list) {
			if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
				return true;
			}
		}
		return false; // 안쓰면 에러가뜸 : 조건이 안맞아도 리턴을 해줘야된다
	}

	// 리스트 전체를 출력해주기 때문에 매개변수는 따로 받지 않아도된다
	public List<UserDTO> findAll() {
		return list;
	}

	public UserDTO findById(String email, String password) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return  null;
	}

}

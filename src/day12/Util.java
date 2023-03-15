package day12;

import java.util.List;
import java.util.Scanner;

public class Util {
	Scanner sc = new Scanner(System.in);

	public int numberCheck() {
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			sc.nextLine();
			return -1;
		}
	}

	public String overlapCheck(List<UserDTO> list, String str) {
		while (true) {
			System.out.println(str + "> ");
			String email = sc.next();
			boolean find = false;
			for (UserDTO u : list) {
				if (u.getEmail().equals(email + "@" + UserDTO.getDomain())) {
					System.out.println("중복된 " + str);
					find = true;
					break;
				}
			}
			if (find) {
				continue;
			}
			return email;
		}
	}

}

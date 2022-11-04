package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import willydekeyser.dto.User;

@Service
public class UserService {

	private static List<User> users = new ArrayList<>();

	public List<User> getUsers() {
		return users;
	}

	public List<User> createUser(User user) {
		List<User> usersTemp = new ArrayList<>(users);
		usersTemp.add(user);
		users = usersTemp;
		return users;
	}

	public List<User> updateUser(User user) {
		List<User> usersTemp = users.stream().map((u) -> {
			if (u.id() == user.id()) {
				return u = new User(user.id(), user.firstname(), user.lastname());
			}
			return u;
		}).toList();
		users = usersTemp;
		return users;
	}

	public List<User> patchUser(User user) {
		List<User> usersTemp = users.stream().map((u) -> {
			if (u.id() == user.id()) {
				return u = new User(user.id(), user.firstname(), user.lastname());
			}
			return u;
		}).toList();
		users = usersTemp;
		return users;
	}

	public void deleteUser(User user) {
		List<User> userTemp = users.stream().filter(u -> u.id() != user.id()).toList();
		users = userTemp;
	}
}

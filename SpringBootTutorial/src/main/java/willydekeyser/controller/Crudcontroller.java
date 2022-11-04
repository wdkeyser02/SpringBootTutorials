package willydekeyser.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import willydekeyser.dto.User;

@RestController
@RequestMapping("/crud")
public class Crudcontroller {

	private static List<User> users = new ArrayList<>();
	
	@GetMapping("")
	public List<User> getUsers() {
		return users;
	}
	
	@PostMapping("")
	public List<User> createUser(@RequestBody User user) {
		List<User> usersTemp = new ArrayList<>(users);
		usersTemp.add(user);
		users = usersTemp;
		return users;
	}
	
	@PutMapping("")
	public List<User> updateUser(@RequestBody User user) {
		List<User> usersTemp = users.stream()
				.map((u) -> {
					if (u.id() == user.id()) {
						return u = new User(user.id(), user.firstname(), user.lastname());
					}
					return u;
					})
				.toList();
		users = usersTemp;
		return users;
	}
	
	@PatchMapping("")
	public List<User> patchUser(@RequestBody User user) {
		List<User> usersTemp = users.stream()
				.map((u) -> {
					if (u.id() == user.id()) {
						return u = new User(user.id(), user.firstname(), user.lastname());
					}
					return u;
					})
				.toList();
		users = usersTemp;
		return users;
	}
	
	@DeleteMapping("")
	public void deleteUser(@RequestBody User user) {
		List<User> userTemp = users.stream()
			.filter(u -> u.id() != user.id())
			.toList();
		users = userTemp;
	}

}

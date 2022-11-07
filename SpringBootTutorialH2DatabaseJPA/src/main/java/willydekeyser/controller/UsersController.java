package willydekeyser.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import willydekeyser.model.Users;
import willydekeyser.service.UsersService;

@RestController
@RequestMapping("/crud")
@RequiredArgsConstructor
public class UsersController {

	private final UsersService usersService;
	
	@GetMapping
	public List<Users> getUsers() {
		return usersService.getUsers();
	}
	
	//@GetMapping("/{id}")
	//public Users getUserById(@PathVariable Integer id) {
	//	return usersService.getUserById(id);
	//}
	
	@PostMapping
	public Users createUser(@RequestBody Users user) {
		return usersService.createUser(user);
	}
	
	@PostMapping("/list")
	public List<Users> createAllUser(@RequestBody List<Users> users) {
		return usersService.createAllUser(users);
	}
	
	@PutMapping
	public Users updateUser(@RequestBody Users user) {
		return usersService.updateUser(user);
	}
	
	@PatchMapping
	public Users patchUser(@RequestBody Users user) {
		return usersService.patchUser(user);
	}
	
	@DeleteMapping
	public void deleteUser(@RequestBody Users user) {
		usersService.deleteUser(user);
	}
}

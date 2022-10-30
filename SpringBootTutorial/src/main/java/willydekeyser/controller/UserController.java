package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import willydekeyser.dto.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public String getUser() {
		return "User";
	}
	
	@GetMapping("/user/{firstname}/{lastname}")
	public String getFullname(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		User user = new User(1, firstname, lastname);
		return user.fullname();
	}
}

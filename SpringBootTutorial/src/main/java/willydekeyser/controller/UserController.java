package willydekeyser.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import willydekeyser.dto.User;

@RestController
@RequestMapping("/getmapping")
public class UserController {

	@GetMapping()
	// http://localhost:8080/getmapping
	public String getUser() {
		return "User";
	}
	
	@GetMapping("variable1/{firstname}/{lastname}")
	// http://localhost:8080/getmapping/variable1/willy/De Keyser
	public String getVariable1(
			@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		User user = new User(1, firstname, lastname);
		return user.fullname();
	}
	
	@GetMapping("variable2")
	// http://localhost:8080/getmapping/variable2?firstname=willy&lastname=De Keyser
	public String getVariable2(
			@RequestParam(value = "firstname", defaultValue = "Bill", required = false) String firstname, 
			@RequestParam(value = "lastname", defaultValue = "Gates", required = false) String lastname) {
		User user = new User(1, firstname, lastname);
		return user.fullname();
	}
	
	@GetMapping("variable3")
	// http://localhost:8080/getmapping/variable3
	// Body plain
	// Willy De Keyser
	public String getVariable3(
			@RequestBody(required = true) String name) {
		return name;
	}
	
	@GetMapping("variable4")
	// http://localhost:8080/getmapping/variable4
	// Body Json
	// {
	//	 "id" : 1,
	//	 "firstname" : "Willy",
	//	 "lastname" : "De Keyser"
	// }
	public User getVariable4(
			@RequestBody(required = true) User user) {
		return user;
	}
	
	@RequestMapping(path = "getrequestmapping", method = RequestMethod.GET)
	// http://localhost:8080/getmapping/getrequestmapping
	public String getRequestMapping() {
		return "Willy De Keyser";
	}
	
	@GetMapping("getresponseentityok")
	// http://localhost:8080/getmapping/getresponseentityok
	public ResponseEntity<String> getResponseEntiyok() {
		return new ResponseEntity<>("Willy De Keyser", HttpStatus.OK);
	}
	
	@GetMapping("getresponseentitytimeout")
	// http://localhost:8080/getmapping/getresponseentitytimeout
	public ResponseEntity<String> getResponseEntiyTimeogut() {
		return new ResponseEntity<>("Time out", HttpStatus.REQUEST_TIMEOUT);
	}
	
	@GetMapping("getVoid")
	// http://localhost:8080/getmapping/void
	public void getvoid() {
	}
	
}

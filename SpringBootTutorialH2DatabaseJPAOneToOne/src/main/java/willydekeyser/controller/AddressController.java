package willydekeyser.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import willydekeyser.dto.AddressUsersDto;
import willydekeyser.service.AddressService;

@RestController
@RequiredArgsConstructor
public class AddressController {
	
	private final AddressService addressService;
	
	@GetMapping("/address")
	public List<AddressUsersDto> getAddress() {
		return addressService.getAddress();
	}
	
	@GetMapping("/address/{id}")
	public AddressUsersDto getAddressById(@PathVariable Integer id) {
		return addressService.getAddressById(id);
	}
}

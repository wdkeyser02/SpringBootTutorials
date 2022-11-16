package willydekeyser.mapping;

import org.springframework.stereotype.Component;

import willydekeyser.dto.AddressDto;
import willydekeyser.dto.UsersAddressDto;
import willydekeyser.dto.UsersDto;
import willydekeyser.model.Users;

@Component
public class UsersMapping {

	public UsersDto mapUsersToUsersDto(Users users) {
		return new UsersDto(users.getId(), users.getFirstname(), users.getLastname(), users.getEmail(), users.getPhone());
	}
	
	public UsersAddressDto mapUsersToUsersAddressDto(Users users) {
		return new UsersAddressDto(users.getId(), users.getFullname(), 
				new AddressDto(users.getAddress().getId(), users.getAddress().getStreet(), 
						users.getAddress().getNumber(), users.getAddress().getZipcode(), users.getAddress().getCity()), users.getEmail(), users.getPhone());
	}
	
}

package willydekeyser.mapping;

import org.springframework.stereotype.Component;

import willydekeyser.dto.AddressDto;
import willydekeyser.dto.AddressUsersDto;
import willydekeyser.dto.UsersDto;
import willydekeyser.model.Address;

@Component
public class AddressMapping {
	
	public AddressDto mapAddressToAddressDto(Address address) {
		return new AddressDto(address.getId(), address.getStreet(), address.getNumber(), address.getZipcode(), address.getCity());
	}
	
	public AddressUsersDto mapAddressToAddressUsersDto(Address address) {
		return new AddressUsersDto(address.getId(), address.getStreet(), address.getNumber(), address.getZipcode(), address.getCity(), 
				new UsersDto(address.getUsers().getId(), address.getUsers().getFirstname(), address.getUsers().getLastname(), address.getUsers().getEmail(), address.getUsers().getPhone()));
	}

}

package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import willydekeyser.dto.AddressUsersDto;
import willydekeyser.mapping.AddressMapping;
import willydekeyser.repository.AddressRepository;

@Service
@RequiredArgsConstructor
public class AddressService {

	private final AddressRepository addressRepository;
	private final AddressMapping addressMapping;
	
	public List<AddressUsersDto> getAddress() {
		List<AddressUsersDto> addressUsersDto = new ArrayList<>();
		addressRepository.findAll().forEach(address -> addressUsersDto.add(addressMapping.mapAddressToAddressUsersDto(address)));
		return addressUsersDto;
	}
	
	public AddressUsersDto getAddressById(Integer id) {
		return addressMapping.mapAddressToAddressUsersDto(addressRepository.findById(id).orElse(null));
	}

}

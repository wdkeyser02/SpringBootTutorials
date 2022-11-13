package willydekeyser.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import willydekeyser.model.Address;
import willydekeyser.repository.AddressRepository;

@Service
@RequiredArgsConstructor
public class AddressService {

	private final AddressRepository addressRepository;
	
	public List<Address> getAddress() {
		return addressRepository.findAll();
	}
	
	public Address getAddressById(Integer id) {
		return addressRepository.findById(id).orElse(null);
	}
}

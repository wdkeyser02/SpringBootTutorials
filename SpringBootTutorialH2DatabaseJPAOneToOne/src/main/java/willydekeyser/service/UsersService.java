package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import willydekeyser.dto.UsersAddressDto;
import willydekeyser.mapping.UsersMapping;
import willydekeyser.model.Users;
import willydekeyser.repository.UsersRepository;

@Service
@RequiredArgsConstructor
public class UsersService {

	private final UsersRepository usersRepository;
	private final UsersMapping usersMapping;

	public List<UsersAddressDto> getUsers() {
		List<UsersAddressDto> usersAddressDto = new ArrayList<>();
		usersRepository.findAll().forEach(user -> usersAddressDto.add(usersMapping.mapUsersToUsersAddressDto(user)));
		return usersAddressDto;
	}
	
	public UsersAddressDto getUserById(Integer id) {
		return usersMapping.mapUsersToUsersAddressDto(usersRepository.findById(id).orElse(null));
	}
	
	public Users createUser(Users user) {
		return usersRepository.save(user);
	}
	
	public List<Users> createAllUser(List<Users> users) {
		return usersRepository.saveAll(users);
	}
	
	public Users updateUser(Users user) {
		return usersRepository.save(user);
	}
	
	public Users patchUser(Users user) {
		return usersRepository.save(user);
	}
	
	public void deleteUser(Users user) {
		usersRepository.delete(user);
	}
}

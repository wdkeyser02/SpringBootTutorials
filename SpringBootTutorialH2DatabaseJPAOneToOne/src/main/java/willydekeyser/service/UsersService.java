package willydekeyser.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import willydekeyser.model.Users;
import willydekeyser.repository.UsersRepository;

@Service
@RequiredArgsConstructor
public class UsersService {

	private final UsersRepository usersRepository;

	public List<Users> getUsers() {
		return usersRepository.findAll();
	}
	
	public Users getUserById(Integer id) {
		return usersRepository.findById(id).orElse(null);
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

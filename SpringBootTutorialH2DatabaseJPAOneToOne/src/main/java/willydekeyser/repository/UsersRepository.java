package willydekeyser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import willydekeyser.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}

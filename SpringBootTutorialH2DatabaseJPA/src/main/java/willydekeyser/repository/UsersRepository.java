package willydekeyser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import willydekeyser.model.Users;

public interface UsersRepository extends ListCrudRepository<Users, Integer>, JpaRepository<Users, Integer> {

}

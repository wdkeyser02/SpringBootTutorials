package willydekeyser.repository;

import org.springframework.data.repository.ListCrudRepository;

import willydekeyser.model.Users;

public interface UserRepository extends ListCrudRepository<Users, Integer> {

}

package willydekeyser.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import willydekeyser.model.Users;

@Repository
public interface UserRepository extends ListCrudRepository<Users, Integer> {

}

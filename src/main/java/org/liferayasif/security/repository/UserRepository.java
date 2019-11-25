package org.liferayasif.security.repository;
import java.util.Optional;

import org.liferayasif.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
}

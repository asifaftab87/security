package org.liferayasif.security.repository;

import org.liferayasif.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByRole(String role);

}

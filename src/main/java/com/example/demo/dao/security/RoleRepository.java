package com.example.demo.dao.security;

//RoleRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.security.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}

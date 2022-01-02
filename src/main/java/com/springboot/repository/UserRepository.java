package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.User;
//JpaRepository exposes CRUD operations on User entity, and pass type of the primary key as second argument
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}

package com.ipigeon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipigeon.app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findUserByEmail(String email);

}

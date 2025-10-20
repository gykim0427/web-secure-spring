package com.geun.wss.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geun.wss.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	
}

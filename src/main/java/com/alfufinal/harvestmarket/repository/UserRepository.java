package com.alfufinal.harvestmarket.repository;

import com.alfufinal.harvestmarket.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
package com.alfufinal.harvestmarket.repository;

import com.alfufinal.harvestmarket.security.entity.ConfirmationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationRepository extends JpaRepository<ConfirmationEntity, Long> {

}

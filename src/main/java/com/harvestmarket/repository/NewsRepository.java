package com.harvestmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harvestmarket.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}

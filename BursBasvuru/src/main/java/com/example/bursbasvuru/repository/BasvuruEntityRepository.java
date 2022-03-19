package com.example.bursbasvuru.repository;

import com.example.bursbasvuru.entity.BasvuruEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasvuruEntityRepository extends JpaRepository<BasvuruEntity, Long> {
}
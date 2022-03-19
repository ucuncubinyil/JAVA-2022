package com.example.bursbasvuru.repository;

import com.example.bursbasvuru.entity.OgrenciEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgrenciEntityRepository extends JpaRepository<OgrenciEntity, Long> {
}
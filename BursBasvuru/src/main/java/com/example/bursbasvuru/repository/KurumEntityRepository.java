package com.example.bursbasvuru.repository;

import com.example.bursbasvuru.entity.KurumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KurumEntityRepository extends JpaRepository<KurumEntity, Long> {
}
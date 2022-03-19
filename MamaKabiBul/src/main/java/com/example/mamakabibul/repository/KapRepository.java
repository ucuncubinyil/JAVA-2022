package com.example.mamakabibul.repository;

import com.example.mamakabibul.entiy.KapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KapRepository extends JpaRepository<KapEntity, Long> {

}

package com.example.bursbasvuru.service;


import com.example.bursbasvuru.entity.OgrenciEntity;
import com.example.bursbasvuru.repository.OgrenciEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OgrenciService {

    @Autowired
    private OgrenciEntityRepository repository;

    public List<OgrenciEntity> getAllOgrenci() {
        return repository.findAll();
    }

    public OgrenciEntity getOgrenciById(Long id) {
        Optional<OgrenciEntity> optionalOgrenciEntity = repository.findById(id);
        if (optionalOgrenciEntity.isPresent()) {
            return optionalOgrenciEntity.get();
        } else {
            return null;
        }
    }

    public String deleteOgrenciById(Long id) {
        Optional<OgrenciEntity> ogrenciEntity = repository.findById(id);
        if (ogrenciEntity.isPresent()) {
            repository.delete(ogrenciEntity.get());
            return "Sildim";
        }else{
            return "Böyle bir kayıt yok";
        }

    }
}

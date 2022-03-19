package com.example.bursbasvuru.service;


import com.example.bursbasvuru.entity.KurumEntity;
import com.example.bursbasvuru.entity.OkulEntity;
import com.example.bursbasvuru.repository.KurumEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KurumService {

    @Autowired
    private KurumEntityRepository repository;


    public KurumEntity createOkul(KurumEntity okul) {
        return repository.save(okul);
    }

    public String deleteOkul(Long id) {
        Optional<KurumEntity> kurumEntityOptional = repository.findById(id);

        if (kurumEntityOptional.isPresent()) {
            repository.delete(kurumEntityOptional.get());
            return "sildim";
        }else{
            return "Böyle bir kaydı bulamadım";
        }
    }

    public KurumEntity getOkulById(Long id) {
        Optional<KurumEntity> kurumEntityOptional = repository.findById(id);
        if (kurumEntityOptional.isPresent()) {
            return kurumEntityOptional.get();
        }else{
            return null;
        }
    }

    public List<KurumEntity> listAllOkul() {
        return repository.findAll();
    }

    public KurumEntity updateOkul(Long id, KurumEntity kurumEntity) {
        Optional<KurumEntity> kurumEntityOptional = repository.findById(id);

        if (kurumEntityOptional.isPresent()) {
            kurumEntityOptional.get().setKurumAdi(kurumEntity.getKurumAdi());
            return repository.save(kurumEntityOptional.get());
        }else{
            return null;
        }
    }
}

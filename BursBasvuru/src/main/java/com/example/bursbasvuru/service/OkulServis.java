package com.example.bursbasvuru.service;


import com.example.bursbasvuru.entity.OkulEntity;
import com.example.bursbasvuru.repository.OkulEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OkulServis {


    @Autowired
    private OkulEntityRepository repository;

    public OkulEntity createOkul(OkulEntity okul) {
        return repository.save(okul);
    }

    public String deleteOkul(Long id) {
        Optional<OkulEntity> okulEntityOptional = repository.findById(id);

        if (okulEntityOptional.isPresent()) {
            repository.delete(okulEntityOptional.get());
            return "sildim";
        }else{
            return "Böyle bir kaydı bulamadım";
        }
    }

    public OkulEntity getOkulById(Long id) {
        Optional<OkulEntity> okulEntityOptional = repository.findById(id);
        if (okulEntityOptional.isPresent()) {
            return okulEntityOptional.get();
        }else{
            return null;
        }
    }

    public List<OkulEntity> listAllOkul() {
        return repository.findAll();
    }

    public OkulEntity updateOkul(Long id, OkulEntity okulEntity) {
        Optional<OkulEntity> okulEntityOptional = repository.findById(id);

        if (okulEntityOptional.isPresent()) {
            okulEntityOptional.get().setAdi(okulEntity.getAdi());
            return repository.save(okulEntityOptional.get());
        }else{
            return null;
        }
    }

}

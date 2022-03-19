package com.example.mamakabibul.service;


import com.example.mamakabibul.entiy.KapEntity;
import com.example.mamakabibul.repository.KapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KapService {


    @Autowired
    private KapRepository kapRepository;

    public List<KapEntity> findAllKaps() {

        return kapRepository.findAll();
    }

    public KapEntity saveKap(KapEntity kapEntity) {
        kapRepository.save(kapEntity);
        return kapEntity;
    }

    public KapEntity getKapById(Long id) {
        Optional<KapEntity> optionalKapEntity =  kapRepository.findById(id);

        if (optionalKapEntity.isPresent()) {
            return optionalKapEntity.get();
        }else{

            return null;
        }

    }

    public KapEntity updateKap(Long id, KapEntity kapEntity) {
        Optional<KapEntity> optionalKapEntity =  kapRepository.findById(id);

        if (optionalKapEntity.isPresent()) {
            KapEntity localKap = optionalKapEntity.get();
            localKap.setAdi(kapEntity.getAdi());
            localKap.setAciklama(kapEntity.getAciklama());
            localKap.setLng(kapEntity.getLng());
            localKap.setLat(kapEntity.getLat());
            localKap.setTipi(kapEntity.getTipi());
            localKap.setKapDurumu(kapEntity.getKapDurumu());
            localKap.setTemizlikDurumu(kapEntity.getTemizlikDurumu());
            localKap.setFizikselMateryal(kapEntity.getFizikselMateryal());
            localKap.setTipi(kapEntity.getTipi());

            kapRepository.save(localKap);

            return kapEntity;
        }else{
            return null;
        }

    }

    public String deleteKap(Long id) {
        Optional<KapEntity> optionalKapEntity =  kapRepository.findById(id);

        if (optionalKapEntity.isPresent()) {
            kapRepository.delete(optionalKapEntity.get());
            return "Sildim";
        }else{
            return "Kayıt yok ki";
        }
    }

}

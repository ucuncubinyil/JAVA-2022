package com.example.mamakabibul.controller;

import com.example.mamakabibul.entiy.KapEntity;
import com.example.mamakabibul.service.KapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KapController {

    @Autowired
    private KapService kapService;

    @GetMapping("/kaplar")
    private List<KapEntity> findAllKap() {
        return kapService.findAllKaps();
    }

    @PostMapping("/kap/ekle")
    private KapEntity saveKap(@RequestBody KapEntity kapEntity) {
        kapService.saveKap(kapEntity);
        return kapEntity;
    }

    @GetMapping("/kaplar/{id}")
    private KapEntity kapEntity (@PathVariable Long id) {
        return kapService.getKapById(id);
    }

    @PutMapping("/kaplar/{id}")
    private KapEntity updateKap(@PathVariable Long id, @RequestBody KapEntity kapEntity) {
        return kapService.updateKap(id, kapEntity);
    }

    @DeleteMapping("/kaplar/{id}")
    private String deleteKap(@PathVariable Long id) {
        return kapService.deleteKap(id);
    }

}

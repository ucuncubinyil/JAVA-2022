package com.example.bursbasvuru.controller;


import com.example.bursbasvuru.entity.KurumEntity;
import com.example.bursbasvuru.entity.OkulEntity;
import com.example.bursbasvuru.service.KurumService;
import com.example.bursbasvuru.service.OkulServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kurum")
public class KurumController {

    @Autowired
    private KurumService servis;

    @GetMapping
    public List<KurumEntity> listAllOkul() {
        return servis.listAllOkul();
    }

    @GetMapping("{id}")
    public KurumEntity getOkulById(@PathVariable Long id) {
        return servis.getOkulById(id);
    }

    @PostMapping("create")
    public KurumEntity createOkul(@RequestBody KurumEntity okul) {
        return servis.createOkul(okul);
    }

    @PutMapping("{id}")
    private KurumEntity updateOkul(@PathVariable Long id, @RequestBody KurumEntity okul) {
        return servis.updateOkul(id, okul);
    }

    @DeleteMapping("{id}")
    private String deleteOkul(@PathVariable Long id) {
        return servis.deleteOkul(id);
    }
}

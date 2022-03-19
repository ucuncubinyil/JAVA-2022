package com.example.bursbasvuru.controller;


import com.example.bursbasvuru.entity.OkulEntity;
import com.example.bursbasvuru.service.OkulServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/okul")
public class OkulController {

    @Autowired
    private OkulServis servis;

    @GetMapping
    public List<OkulEntity> listAllOkul() {
        return servis.listAllOkul();
    }

    @GetMapping("{id}")
    public OkulEntity getOkulById(@PathVariable Long id) {
        return servis.getOkulById(id);
    }

    @PostMapping("create")
    public OkulEntity createOkul(@RequestBody OkulEntity okul) {
        return servis.createOkul(okul);
    }

    @PutMapping("{id}")
    private OkulEntity updateOkul(@PathVariable Long id, @RequestBody OkulEntity okul) {
        return servis.updateOkul(id, okul);
    }

    @DeleteMapping("{id}")
    private String deleteOkul(@PathVariable Long id) {
        return servis.deleteOkul(id);
    }
}

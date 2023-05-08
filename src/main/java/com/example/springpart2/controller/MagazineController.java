package com.example.springpart2.controller;

import com.example.springpart2.model.Item;
import com.example.springpart2.service.MagazineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class MagazineController {
    private final MagazineService magazineService;

    public MagazineController(MagazineService magazineService) {
        this.magazineService = magazineService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> id) {
        magazineService.add(id);
    }
    @GetMapping("/get")
    public List<Item> get(){
        return magazineService.get();
    }

}

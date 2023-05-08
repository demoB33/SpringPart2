package com.example.springpart2.service;

import com.example.springpart2.component.Basket;
import com.example.springpart2.model.Item;
import com.example.springpart2.repository.MagazineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MagazineServiceImpl implements MagazineService {
    private final Basket basket;
private final MagazineRepository magazineRepository;

    public MagazineServiceImpl(Basket basket, MagazineRepository magazineRepository) {
        this.basket = basket;
        this.magazineRepository = magazineRepository;
    }


    @Override
    public void add(Set<Integer> id) {
        basket.add(id);
    }

    @Override
    public List<Item> get() {
        return basket.get().stream()
                .map(magazineRepository::get)
                .collect(Collectors.toList());
    }

}

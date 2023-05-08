package com.example.springpart2.service;

import com.example.springpart2.model.Item;

import java.util.List;
import java.util.Set;

public interface MagazineService {
    void add(Set<Integer> id);
    List<Item> get();
}

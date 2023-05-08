package com.example.springpart2.repository;

import com.example.springpart2.model.Item;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class MagazineRepository {
    private  int firstId = 1;
    private final Map<Integer,Item> magazine =new HashMap<>();

    @PostConstruct
    public void init() {
        magazine.put(firstId,new Item(firstId++,"Book"));
        magazine.put(firstId,new Item(firstId++,"NoteBook"));
        magazine.put(firstId,new Item(firstId++,"Phone"));
    }

    public void add(Item item) {
        magazine.put(item.getId(),item);
    }

    public Item get(int id) {
        return magazine.get(id);
    }

    public List<Item> getAll() {
        return new ArrayList<>(magazine.values());
    }

    public void update(int id, Item item) {
        if (magazine.containsKey(id)) {
            magazine.replace(id, item);
        }
    }
    public Item delete(int id) {
        return magazine.remove(id);
    }

}

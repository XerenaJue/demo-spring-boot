package com.example.springbootapplication.demospringboot.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Item {
    APPEL,
    PEER,
    AARDBEI,
    KERS,
    BANAAN;

    private static List<Item> list = Arrays.asList(Item.values());

    public static List<String> itemList() {
        return Stream.of(Item.values())
                .map(Item::name)
                .collect(Collectors.toList());
    }

    public static Item getItem() {
        return list.get(new Random().nextInt(list.size()));
    }
}

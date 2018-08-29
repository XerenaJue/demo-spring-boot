package com.example.springbootapplication.demospringboot.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ItemTest {

    @Test
    public void itemList() {
        assertNotNull(Item.itemList());
    }

    @Test
    public void getItem() {
        assertNotNull(Item.getItem());
    }
}

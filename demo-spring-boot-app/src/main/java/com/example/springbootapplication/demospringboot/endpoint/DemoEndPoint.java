package com.example.springbootapplication.demospringboot.endpoint;

import com.example.springbootapplication.demospringboot.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoEndPoint {

    @RequestMapping("/list")
    public List<String> itemList() {
        return Item.itemList();
    }
}

package com.example.springbootapplication.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springbootapplication.demospringboot")
public class DemoSpringBootApplication {

	public static void main(String[] args) {
	    SpringApplication.run(DemoSpringBootApplication.class, args);

	    ReactiveWebClient reactiveWebClient = new ReactiveWebClient();
        System.out.println(reactiveWebClient.getResult());
	}




}

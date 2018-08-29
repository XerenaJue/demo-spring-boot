package com.example.springbootapplication.demospringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ReactiveEndPointMonoRouter {
    @Bean
    public RouterFunction<ServerResponse> route(DemoReactiveEndPointMono demoReactiveEndPointMono) {

        return RouterFunctions
                .route(RequestPredicates.GET("/item").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), demoReactiveEndPointMono::itemMono);
    }
}

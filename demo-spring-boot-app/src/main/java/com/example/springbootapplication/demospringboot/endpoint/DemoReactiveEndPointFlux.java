package com.example.springbootapplication.demospringboot.endpoint;

import com.example.springbootapplication.demospringboot.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.Arrays;
import java.util.stream.Stream;

@RestController
public class DemoReactiveEndPointFlux {

    private static String get() {
        return Arrays.toString(Item.values());
    }

    @RequestMapping(value = "/itemsFlux")
    public Flux<String> itemsFlux() {
        Flux<String> stringFlux = Flux.fromStream(Stream.generate(DemoReactiveEndPointFlux::get));

        Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(1));

        return Flux.zip(stringFlux, durationFlux).map(Tuple2::getT1);
    }
}

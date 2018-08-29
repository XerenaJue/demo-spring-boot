package com.example.springbootapplication.demospringboot;

import com.example.springbootapplication.demospringboot.endpoint.DemoEndPoint;
import com.example.springbootapplication.demospringboot.endpoint.DemoReactiveEndPointFlux;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.server.ServerRequest;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringBootApplicationTests {

    @Autowired
    private DemoEndPoint demoEndPoint;

    @Autowired
    private DemoReactiveEndPointMono demoReactiveEndPointMono;

    @Autowired
	private DemoReactiveEndPointFlux demoReactiveEndPointFlux;

    @Mock
	private ServerRequest request;

	@Test
	public void contextLoads() {

		assertNotNull(demoEndPoint.itemList());
		assertNotNull(demoReactiveEndPointMono.itemMono(request));
		assertNotNull(demoReactiveEndPointFlux.itemsFlux());
	}

}

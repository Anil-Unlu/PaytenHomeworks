package com.homework3;


import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseIntegrationTest {
	
	@LocalServerPort
	protected int serverPort;
	
	@Mock
	protected TestRestTemplate testRestTemplate;
	
	@Test
	public void contextLoads() {
		
	}
}

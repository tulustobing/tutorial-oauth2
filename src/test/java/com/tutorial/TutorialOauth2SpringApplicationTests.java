package com.tutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TutorialOauth2SpringApplication.class)
@WebAppConfiguration
public class TutorialOauth2SpringApplicationTests {

	@Test
	public void contextLoads() {
	}

}

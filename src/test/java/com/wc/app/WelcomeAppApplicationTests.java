package com.wc.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WelcomeAppApplicationTests {
	
	private static Logger LOGGER = LoggerFactory.getLogger(WelcomeAppApplicationTests.class);

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHelloEndpoint() throws Exception {
		LOGGER.info("Test Case run start for controller layer");
		mockMvc.perform(get("/welcome/msg")).andExpect(status().isOk()).andExpect(content().string("Welcome to git"));
	}

}

package com.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.http.HttpStatus;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CashCardApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void shouldREturnACashCardWhenDataIsSaved(){
		ResponseEntity<String>response = restTemplate.getForEntity("/cashcards/99",String.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}

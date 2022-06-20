package com.accenture.graphQLDemo;

import com.accenture.graphQLDemo.model.Person;
import com.accenture.graphQLDemo.service.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GraphQlDemoApplicationTests {

	@Autowired
	private PersonServiceImpl pService;
	@Test
	void contextLoads() {
	}

	@Test
	public void add(){
		Person p = new Person(1,"Alex","John","alex@mail.com","9097976770", "Singing");

		pService.createPerson(p);
	}
}

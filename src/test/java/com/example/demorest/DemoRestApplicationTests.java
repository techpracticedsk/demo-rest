package com.example.demorest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoRestApplicationTests {

	@Autowired
	UserRepository userrepo;

	@Autowired
	DemoRestService demoRestService;


	/*@Test
	void contextLoads() {
	}*/

	@Test
	public void testGetAllUser(){
		System.out.println("\n\n Result All Users :: \n\n ");
		demoRestService.getAllUser().stream().forEach(userDTO -> {
			System.out.println(userDTO.toString());
		});
	}

	@Test
	public void testGetUserCities(){
		System.out.println("\n\n Result All Users Cities :: \n\n ");
		System.out.println(demoRestService.getAllUserCities());
	}

	@Test
	public void testGetUsersByFirstName(){
		System.out.println("\n\n All Users By First Name :: \n\n ");
		System.out.println(demoRestService.getUsersByFirstName("vittal"));
	}
}

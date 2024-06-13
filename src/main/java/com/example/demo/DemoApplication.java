package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	static usuarioRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("ah papa como no ");
		Usuario usuarioDemo = new Usuario();

		Usuario user = repository.findById(1L).get();

		if (user != null){

			System.out.println(user.getApellido());

		} else {
			System.out.println("ff");
		}


	}


}

package com.mission.mission3;

import com.mission.mission3.model.Alien;
import com.mission.mission3.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Mission3Application {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(Mission3Application.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setModel("UFO");
		alien1.setTech("Titaniumz");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());

	}

}

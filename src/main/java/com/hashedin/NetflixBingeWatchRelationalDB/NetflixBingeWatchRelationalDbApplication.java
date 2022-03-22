package com.hashedin.NetflixBingeWatchRelationalDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NetflixBingeWatchRelationalDbApplication {

	@Autowired
	TestRepository testRepository;
	public static void main(String[] args) {
		SpringApplication.run(NetflixBingeWatchRelationalDbApplication.class, args);
	}

	@PostMapping("/create")
	public Test createTest(@RequestBody Test test){
		return  testRepository.save(test);

	}

}

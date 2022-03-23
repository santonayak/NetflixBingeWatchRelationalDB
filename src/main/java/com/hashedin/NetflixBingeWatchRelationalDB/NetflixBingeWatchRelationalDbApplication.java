package com.hashedin.NetflixBingeWatchRelationalDB;

import com.hashedin.NetflixBingeWatchRelationalDB.repository.ShowRepository;
import com.hashedin.NetflixBingeWatchRelationalDB.service.CSVParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NetflixBingeWatchRelationalDbApplication  implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(NetflixBingeWatchRelationalDbApplication.class, args);
	}


	//Runner to sync csv with database once application starts
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello from runner");
		CSVParserService.UpdateDBWithCSV();
	}
}

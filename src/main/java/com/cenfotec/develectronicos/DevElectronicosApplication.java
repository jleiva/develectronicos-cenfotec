package com.cenfotec.develectronicos;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevElectronicosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DevElectronicosApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

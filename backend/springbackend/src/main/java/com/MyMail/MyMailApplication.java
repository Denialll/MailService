package com.MyMail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMailApplication.class, args);
	}

}

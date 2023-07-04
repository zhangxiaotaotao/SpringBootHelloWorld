package com.zjt;

import com.zjt.initialize.ThirdInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

//	public static void main(String[] args) {
//		var springApplication = new SpringApplication(SpringBootHelloWorldApplication.class);
//		springApplication.addInitializers(new ThirdInitializer());
//		springApplication.run(args);
//	}

}

package com.anshul.praticelast;

import com.anshul.praticelast.controller.HealthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PraticelastApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PraticelastApplication.class, args);
		ApplicationContext context =SpringApplication.run(PraticelastApplication.class, args);
		HealthController obj=context.getBean(HealthController.class);
		obj.build();
	}
}

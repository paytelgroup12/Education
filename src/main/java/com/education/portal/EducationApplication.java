package com.education.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.education.Admin.repository")
//@EntityScan(basePackages = "com.education.Admin.model")
public class EducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationApplication.class, args);
	}

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewresolver= new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/jsp/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}
	
}

package com.felipe.TechOS.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipe.TechOS.services.DBService;
import com.felipe.TechOS.services.InstanciaDBFactoryBean;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService() {
		return new DBService();
	}

	@Bean
	InstanciaDBFactoryBean instanciaDBFactoryBean() {
		return new InstanciaDBFactoryBean();
	}
}

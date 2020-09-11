package com.adminpro20.mocha.adminpro20security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

@SpringBootApplication
public class Adminpro20SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Adminpro20SecurityApplication.class, args);


	}



}

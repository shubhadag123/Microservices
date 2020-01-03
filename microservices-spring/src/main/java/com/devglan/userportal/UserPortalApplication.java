package com.devglan.userportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;



@SpringBootApplication

public class UserPortalApplication {

	
	public CorsFilter corsFilter() {
	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	CorsConfiguration config = new CorsConfiguration();
	config.setAllowCredentials(true);
	config.addAllowedOrigin("*");
	//config.addAllowedOrigin("http://localhost:4200");
	config.addAllowedHeader("*");
	config.addAllowedMethod("OPTIONS");
	config.addAllowedMethod("GET");
	config.addAllowedMethod("POST");
	config.addAllowedMethod("PUT");
	config.addAllowedMethod("DELETE");
	config.addAllowedMethod("Request");
	config.addAllowedMethod("*");
	source.registerCorsConfiguration("/**", config);
	return new CorsFilter(source);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}
}
package com.example.mob;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Override
    public void addCorsMappings(CorsRegistry rg) {
	rg.addMapping("/**")
	.allowedOrigins("http://localhost:3000")
	.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
	.allowedHeaders("*");	
	}
}

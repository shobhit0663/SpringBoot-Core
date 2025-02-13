package com.example.mob.admin;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigure implements WebMvcConfigurer{
	@Override
    public void addCorsMappings(CorsRegistry rg) {
	rg.addMapping("/**")
	.allowedOrigins("http://localhost:3000")
	.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
	.allowedHeaders("*");	
	}
}

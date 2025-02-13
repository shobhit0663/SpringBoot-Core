package com.itvedant.commerce;
    import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.config.annotation.CorsRegistry;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

	@Configuration
	public class WebConfig implements WebMvcConfigurer{
	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	    	  registry.addMapping("/**")  // Update the path to match the correct endpoint
              .allowedOrigins("http://localhost:3000")  // Allow React app's URL
              .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
              .allowedHeaders("*")  // Allow all headers
              .allowCredentials(true);  // llow all headers
	    }

	}

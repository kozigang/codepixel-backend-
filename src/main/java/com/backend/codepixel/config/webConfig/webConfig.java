package com.backend.codepixel.config.webConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.pattern.PathPatternParser;

@Configuration
public class webConfig implements WebMvcConfigurer {

    @Value("${project.cors.allowed-origins}")
    private String[] allowedOrigins;

    @Value("${project.cors.allowed-methods}")
    private String[] allowedMethods;

    @Override
    public void configurePathMatch(@NonNull PathMatchConfigurer configurer) {
        configurer.setPatternParser(new PathPatternParser()); 
    }

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/**") // Applique CORS à tous les endpoints
                .allowedOrigins(allowedOrigins) // Origines autorisées
                .allowedMethods(allowedMethods); // Méthodes HTTP autorisées
    }
}

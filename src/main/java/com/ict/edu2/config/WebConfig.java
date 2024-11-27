package com.ict.edu2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // 매핑 경로 지정
                        .allowedOrigins("http://localhost:3000") // 허용할 출처
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드
                        .allowCredentials(true); // 자격증명 허용
            }
        };
    }
}

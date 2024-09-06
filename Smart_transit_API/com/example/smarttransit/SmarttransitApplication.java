package com.example.smarttransit;

@SpringBootApplication
public class SmarttransitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmarttransitApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}


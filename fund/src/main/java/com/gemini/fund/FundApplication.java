package com.gemini.fund;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
class FundApplication {
    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class, args);
    }
}
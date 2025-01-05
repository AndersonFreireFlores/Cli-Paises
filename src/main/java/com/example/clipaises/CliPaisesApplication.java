package com.example.clipaises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.command.annotation.EnableCommand;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCommand(CountryCommand.class)
public class CliPaisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CliPaisesApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}

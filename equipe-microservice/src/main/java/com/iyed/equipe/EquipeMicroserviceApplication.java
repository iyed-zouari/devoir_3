package com.iyed.equipe;

import com.iyed.equipe.entities.Equipe;
import com.iyed.equipe.repos.EquipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
@EnableFeignClients
@SpringBootApplication
public class EquipeMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquipeMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EquipeRepository equipeRepository) {
        return args -> {
            equipeRepository.save(Equipe.builder()
                    .name("Real madrid")
                    .description("Real madrid est une equipe trés célèbre")
                    .legCode("La Liga")
                    .build());
        };
    }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }


}

package com.iyed.league;

import com.iyed.league.entities.League;
import com.iyed.league.repos.LeagueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LeagueMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeagueMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(LeagueRepository leagueRepository) {
        return args -> {
            leagueRepository.save(League.builder()
                    .leagueName("Premier League")
                    .leagueCountry("England")
                    .leagueDescription("Top English football league")
                    .leagueCode("PL")
                    .build());

            leagueRepository.save(League.builder()
                    .leagueName("La Liga")
                    .leagueCountry("Spain")
                    .leagueDescription("Top Spanish football league")
                    .leagueCode("LL")
                    .build());
        };
    }
}


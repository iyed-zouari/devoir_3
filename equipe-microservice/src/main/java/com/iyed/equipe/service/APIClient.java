package com.iyed.equipe.service;

import com.iyed.equipe.dto.EquipeDto;
import com.iyed.equipe.dto.LeagueDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081", value = "LEAGUE-MICROSERVICE")
@FeignClient(name = "LEAGUE-MICROSERVICE")
public interface APIClient {
    @GetMapping("api/leagues/{league-name}")
    LeagueDto findByLeagueName(@PathVariable("league-name") String leagueName);
}

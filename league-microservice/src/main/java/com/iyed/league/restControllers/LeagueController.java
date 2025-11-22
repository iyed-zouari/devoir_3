package com.iyed.league.restControllers;

import com.iyed.league.config.Configuration;
import com.iyed.league.dto.LeagueDto;
import com.iyed.league.service.LeagueService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leagues")

public class LeagueController {
    private LeagueService leagueService;

    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

    public LeagueController(LeagueService leagueService){
        this.leagueService = leagueService;
    }


    @GetMapping("{code}")
    public ResponseEntity<LeagueDto> getLeagueByCode(@PathVariable("code") String code )
    {
        return new ResponseEntity<LeagueDto>(
                leagueService.getLeagueByCode(code),HttpStatus.OK);
    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public  ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                        .body(configuration.getName()+" "+configuration.getEmail() );
    }

}

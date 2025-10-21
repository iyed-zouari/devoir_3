package com.iyed.league.service;

import com.iyed.league.dto.LeagueDto;
import com.iyed.league.entities.League;
import com.iyed.league.repos.LeagueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LeagueServiceImpl implements LeagueService {
    private LeagueRepository leagueRepository;

    @Override
    public LeagueDto findByLeagueName(String LeagueName) {
        League leg=leagueRepository.findByLeagueName(LeagueName);
        return new LeagueDto(
                leg.getId(),
                leg.getLeagueName(),
                leg.getLeagueCountry(),
                leg.getLeagueDescription()

        );

    }
}


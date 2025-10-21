package com.iyed.league.service;

import com.iyed.league.dto.LeagueDto;

public interface LeagueService {
    LeagueDto findByLeagueName(String LeagueName);
}

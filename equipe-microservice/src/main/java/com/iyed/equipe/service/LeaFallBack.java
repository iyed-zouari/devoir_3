package com.iyed.equipe.service;

import com.iyed.equipe.dto.LeagueDto;
import org.springframework.stereotype.Component;

@Component
public class LeaFallBack implements APIClient {

    @Override
    public LeagueDto getLeaByCode(String leagueCode) {
        return null;
    }
}

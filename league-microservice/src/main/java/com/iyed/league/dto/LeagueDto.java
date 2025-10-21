package com.iyed.league.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeagueDto {
    private Long id;
    private String leagueName;
    private String leagueCountry;
    private String leagueDescription;
}

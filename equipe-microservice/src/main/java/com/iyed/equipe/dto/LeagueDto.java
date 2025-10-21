package com.iyed.equipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeagueDto {
    private Long id;
    private String leagueName;
    private String leagueDescription;
    private String leagueCountry;

}

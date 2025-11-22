package com.iyed.league.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeagueDto {
    private Long id;
    private String LeagueName;
    private String LeagueCode;
    private String LeagueCountry;
    private String LeagueDescription;
}

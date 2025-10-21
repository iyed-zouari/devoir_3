package com.iyed.equipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {
    private EquipeDto equipeDto;
    private LeagueDto leagueDto;
}

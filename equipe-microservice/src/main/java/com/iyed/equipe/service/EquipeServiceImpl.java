package com.iyed.equipe.service;

import com.iyed.equipe.dto.APIResponseDto;
import com.iyed.equipe.dto.EquipeDto;
import com.iyed.equipe.dto.LeagueDto;
import com.iyed.equipe.entities.Equipe;
import com.iyed.equipe.repos.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class EquipeServiceImpl implements EquipeService {
    private final EquipeRepository equipeRepository;
    //private WebClient webClient;
    private APIClient apiclient;


    @Override
    public APIResponseDto getEquipeById(Long id) {
        Equipe equipe =equipeRepository.findById(Math.toIntExact(id)).get();

//        LeagueDto leagueDto = webClient.get()
//                .uri("http://localhost:8081/api/leagues/" + equipe.getLegCode())
//                .retrieve()
//                .bodyToMono(LeagueDto.class)
//                .block();

        LeagueDto leagueDto = apiclient.findByLeagueName(equipe.getLegCode());

        EquipeDto equipeDto= new EquipeDto(
                equipe.getId(),
                equipe.getName(),
                equipe.getDescription(),
                equipe.getLegCode(),
                leagueDto.getLeagueCountry()

        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEquipeDto(equipeDto);
        apiResponseDto.setLeagueDto(leagueDto);

        return apiResponseDto;

    }
}

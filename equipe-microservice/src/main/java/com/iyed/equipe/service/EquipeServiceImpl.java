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
    private APIClient apiClient;


    @Override
    public APIResponseDto getEquipeById(Long id) {
        String dname;
        Equipe equipe =equipeRepository.findById(id).get();

//        LeagueDto leagueDto = webClient.get()
//                .uri("http://localhost:8081/api/leagues/" + equipe.getLegCode())
//                .retrieve()
//                .bodyToMono(LeagueDto.class)
//                .block();

        LeagueDto leagueDto = apiClient.getLeaByCode(equipe.getLegCode());
        if (leagueDto == null)
            dname = "Undefined";
        else
            dname = leagueDto.getLeagueName();

        EquipeDto equipeDto= new EquipeDto(
                equipe.getId(),
                equipe.getEquipeName(),
                equipe.getEquipeDescription(),
                equipe.getLegCode(),
                dname

        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEquipeDto(equipeDto);
        apiResponseDto.setLeagueDto(leagueDto);

        return apiResponseDto;

    }
}

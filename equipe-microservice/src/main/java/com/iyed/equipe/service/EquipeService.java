package com.iyed.equipe.service;

import com.iyed.equipe.dto.APIResponseDto;
import com.iyed.equipe.dto.EquipeDto;

public interface EquipeService {
    APIResponseDto getEquipeById(Long id);
}

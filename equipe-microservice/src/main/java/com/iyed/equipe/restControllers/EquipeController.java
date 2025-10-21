package com.iyed.equipe.restControllers;

import com.iyed.equipe.dto.APIResponseDto;
import com.iyed.equipe.dto.EquipeDto;
import com.iyed.equipe.service.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/equipes")
@AllArgsConstructor
public class EquipeController {

    private EquipeService equipeService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEquipeById(@PathVariable("id") Long id) {
        return new ResponseEntity<APIResponseDto>(
                equipeService.getEquipeById(id), HttpStatus.OK);
    }
}

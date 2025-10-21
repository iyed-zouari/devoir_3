package com.iyed.equipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipeDto {
    private Long id;
    private String name;
    private String description;
    private String legCode;
    private String legcountry;

}

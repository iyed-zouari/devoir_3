package com.iyed.equipe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipeDto {
    private Long id;
    private String EquipeName;
    private String EquipeDescription;
    private String legCode;
    private String LeagueName;

}

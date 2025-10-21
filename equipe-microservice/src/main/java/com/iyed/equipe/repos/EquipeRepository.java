package com.iyed.equipe.repos;

import com.iyed.equipe.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
    List<Equipe> id(Long id);
}

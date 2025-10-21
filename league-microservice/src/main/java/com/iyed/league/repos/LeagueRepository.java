package com.iyed.league.repos;

import com.iyed.league.entities.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
    League findByLeagueName(String LeagueName);
}

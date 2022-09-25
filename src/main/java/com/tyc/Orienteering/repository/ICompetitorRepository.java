package com.tyc.Orienteering.repository;

import com.tyc.Orienteering.repository.entity.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICompetitorRepository extends JpaRepository<Competitor, Long> {

    Optional<List<Competitor>> findAllOptionalBySportClubId(long value);
}

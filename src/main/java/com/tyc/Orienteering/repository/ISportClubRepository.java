package com.tyc.Orienteering.repository;

import com.tyc.Orienteering.repository.entity.SportClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISportClubRepository extends JpaRepository<SportClub, Long> {
}

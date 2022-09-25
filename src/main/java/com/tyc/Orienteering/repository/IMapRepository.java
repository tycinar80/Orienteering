package com.tyc.Orienteering.repository;

import com.tyc.Orienteering.repository.entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMapRepository extends JpaRepository<Map, Long> {
}

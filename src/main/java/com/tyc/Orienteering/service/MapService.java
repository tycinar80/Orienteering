package com.tyc.Orienteering.service;

import com.tyc.Orienteering.repository.IMapRepository;
import com.tyc.Orienteering.repository.entity.Map;
import com.tyc.Orienteering.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MapService extends ServiceManager<Map, Long> {
    private final IMapRepository repository;

    public MapService(IMapRepository repository) {
        super(repository);
        this.repository = repository;
    }
}

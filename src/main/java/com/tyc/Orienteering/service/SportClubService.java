package com.tyc.Orienteering.service;

import com.tyc.Orienteering.repository.ISportClubRepository;
import com.tyc.Orienteering.repository.entity.SportClub;
import com.tyc.Orienteering.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SportClubService extends ServiceManager<SportClub, Long> {
    private final ISportClubRepository repository;

    public SportClubService(ISportClubRepository repository) {
        super(repository);
        this.repository = repository;
    }
}

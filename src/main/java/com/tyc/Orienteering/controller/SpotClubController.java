package com.tyc.Orienteering.controller;

import com.tyc.Orienteering.repository.entity.SportClub;
import com.tyc.Orienteering.service.SportClubService;
import com.tyc.Orienteering.utility.MappingConstance;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(MappingConstance.SPORTCLUB)
public class SpotClubController {
    private final SportClubService service;

    @GetMapping(MappingConstance.SAVE)
    public ResponseEntity<SportClub> save(String name, String city) {
        SportClub sportClub = SportClub.builder()
                .name(name)
                .city(city)
                .build();
        return ResponseEntity.ok(service.save(sportClub));
    }

    @GetMapping(MappingConstance.FINDALL)
    public ResponseEntity<List<SportClub>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}

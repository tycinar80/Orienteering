package com.tyc.Orienteering.controller;

import com.tyc.Orienteering.repository.entity.Competitor;
import com.tyc.Orienteering.service.CompetitorService;
import com.tyc.Orienteering.utility.MappingConstance;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(MappingConstance.COMPETITOR)
public class CompetitorController {
    private final CompetitorService service;

    @GetMapping(MappingConstance.SAVE)
    public ResponseEntity<Competitor> save(String name, String surname, String birthDate, Long sportClubId) {
        Competitor competitor = Competitor.builder()
                .name(name)
                .surname(surname)
                .birthDate(LocalDate.parse(birthDate))
                .sportClubId(sportClubId)
                .build();
        return ResponseEntity.ok(service.save(competitor));
    }
    @GetMapping(MappingConstance.FINDALL)
    public ResponseEntity<List<Competitor>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(MappingConstance.FINDALLBYSPORTCLUBID)
    public ResponseEntity<List<Competitor>> findAllOptionalBySportClubId(long value) {
        return ResponseEntity.ok(service.findAllOptionalBySportClubId(value).get());
    }
}

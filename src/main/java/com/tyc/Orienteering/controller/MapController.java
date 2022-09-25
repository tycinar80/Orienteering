package com.tyc.Orienteering.controller;

import com.tyc.Orienteering.repository.entity.Map;
import com.tyc.Orienteering.service.MapService;
import com.tyc.Orienteering.utility.MappingConstance;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(MappingConstance.MAP)
public class MapController {
    public final MapService service;

    @GetMapping(MappingConstance.SAVE)
    public ResponseEntity<Map> save(String type, int distance, String city, String area) {
        Map map = Map.builder()
                .type(type)
                .distance(distance) // Distance type = meter
                .city(city)
                .area(area)
                .build();

        return ResponseEntity.ok(service.save(map));
    }
    @GetMapping(MappingConstance.FINDALL)
    public ResponseEntity<List<Map>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}

package com.tyc.Orienteering.utility;

import com.tyc.Orienteering.repository.ICompetitorRepository;
import com.tyc.Orienteering.repository.IMapRepository;
import com.tyc.Orienteering.repository.ISportClubRepository;
import com.tyc.Orienteering.repository.entity.Competitor;
import com.tyc.Orienteering.repository.entity.Map;
import com.tyc.Orienteering.repository.entity.SportClub;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Component
public class DefaultDataImpl {
    private final ICompetitorRepository competitorRepository;
    private final IMapRepository mapRepository;
    private final ISportClubRepository sportClubRepository;

    @PostConstruct
    private void create() {
        saveMap();
        saveSportClub();
        saveCompetitor();
    }

    private void saveSportClub() {
        SportClub sportClub;
        sportClub = SportClub.builder()
                .name("Antalya Oryantiring Kulübü")
                .city("Antalya")
                .build();

        SportClub sportClub2;
        sportClub2 = SportClub.builder()
                .name("Anatolia-O Group")
                .city("Ankara")
                .build();

        sportClubRepository.saveAll(List.of(sportClub, sportClub2));
    }

    private void saveCompetitor() {
        Competitor competitor;
        competitor = Competitor.builder()
                .name("Taha Yasin")
                .surname("ÇINAR")
                .birthDate(LocalDate.parse("1993-01-05"))
                .sportClubId(1L)
                .build();

        Competitor competitor2;
        competitor2 = Competitor.builder()
                .name("Mustafa")
                .surname("YILMAZ")
                .birthDate(LocalDate.parse("1993-05-15"))
                .sportClubId(1L)
                .build();

        Competitor competitor3;
        competitor3 = Competitor.builder()
                .name("Muhammed")
                .surname("TAŞOVA")
                .birthDate(LocalDate.parse("1993-06-18"))
                .sportClubId(2L)
                .build();

        Competitor competitor4;
        competitor4 = Competitor.builder()
                .name("Hasan")
                .surname("AKDOĞAN")
                .birthDate(LocalDate.parse("1994-09-05"))
                .sportClubId(2L)
                .build();

        competitorRepository.saveAll(List.of(competitor, competitor2, competitor3, competitor4));
    }

    public void saveMap() {
        Map map;
        map = Map.builder()
                .type("Kısa Mesafe")
                .distance(3000)
                .city("Antalya")
                .area("Cam Piramit")
                .build();

        Map map2;
        map2 = Map.builder()
                .type("Orta Mesafe")
                .distance(5000)
                .city("Antalya")
                .area("Çakırlar")
                .build();

        Map map3;
        map3 = Map.builder()
                .type("Uzun Mesafe")
                .distance(8000)
                .city("Antalya")
                .area("Side")
                .build();

        mapRepository.saveAll(List.of(map, map2, map3));
    }
}

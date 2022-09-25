package com.tyc.Orienteering.service;

import com.tyc.Orienteering.repository.ICompetitorRepository;
import com.tyc.Orienteering.repository.entity.Competitor;
import com.tyc.Orienteering.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetitorService extends ServiceManager<Competitor, Long> {
   private final ICompetitorRepository repository;

   public CompetitorService(ICompetitorRepository repository) {
       super(repository);
       this.repository = repository;
   }

   public Optional<List<Competitor>> findAllOptionalBySportClubId(long value) {
       return repository.findAllOptionalBySportClubId(value);
   }
}

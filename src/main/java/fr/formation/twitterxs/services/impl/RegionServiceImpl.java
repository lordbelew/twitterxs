package fr.formation.twitterxs.services.impl;

import fr.formation.twitterxs.domain.entities.Region;
import fr.formation.twitterxs.dto.RegionCreateDTO;
import fr.formation.twitterxs.dto.ValueLabelDTO;
import fr.formation.twitterxs.repository.RegionJpaRepository;
import fr.formation.twitterxs.services.RegionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl implements RegionService {

  @Autowired
  private RegionJpaRepository jpaRepo;

  @Override
  public void create(RegionCreateDTO dto) {
    Region region = EntityHelper.asRegion(dto);
    jpaRepo.save(region);
  }

  @Override
  public List<ValueLabelDTO> findAll() {
    return jpaRepo.findAllAsDto();
  }
}

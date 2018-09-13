package fr.formation.twitterxs.services.impl;

import fr.formation.twitterxs.dto.RegionCreateDTO;
import fr.formation.twitterxs.dto.ValueLabelDTO;
import fr.formation.twitterxs.services.RegionService;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl implements RegionService {

  @Override
  public String create(RegionCreateDTO dto) {
    return dto.getCountry() + " ==> " + dto.getLanguage();
  }

  @Override
  public List<ValueLabelDTO> findAll() {
    ValueLabelDTO a = new ValueLabelDTO(1L, "fr_CA");
    ValueLabelDTO b = new ValueLabelDTO(2L, "fr_FR");
    return Arrays.asList(a, b);
  }
}

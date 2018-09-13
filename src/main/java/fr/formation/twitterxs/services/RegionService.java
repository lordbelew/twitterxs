package fr.formation.twitterxs.services;

import fr.formation.twitterxs.dto.RegionCreateDTO;
import fr.formation.twitterxs.dto.ValueLabelDTO;
import java.util.List;

public interface RegionService {

  public String create(RegionCreateDTO dto);

  public List<ValueLabelDTO> findAll();
}

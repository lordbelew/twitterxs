package fr.formation.twitterxs.controllers;

import fr.formation.twitterxs.dto.RegionCreateDTO;
import fr.formation.twitterxs.dto.ValueLabelDTO;
import fr.formation.twitterxs.services.RegionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regions")
public class RegionController {

  @Autowired
  RegionService service;

  @GetMapping("/list")
  protected List<ValueLabelDTO> list() {
    return service.findAll();
  }

  @PostMapping("/create")
  protected void createRegion(@RequestBody RegionCreateDTO dto) {
    service.create(dto);
  }
}

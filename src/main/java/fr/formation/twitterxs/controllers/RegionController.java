package fr.formation.twitterxs.controllers;

import fr.formation.twitterxs.dto.RegionCreateDTO;
import fr.formation.twitterxs.dto.ValueLabelDTO;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regions")
public class RegionController {

  @GetMapping("/list/{label}")
  protected List<ValueLabelDTO> list() {
    ValueLabelDTO a = new ValueLabelDTO(1L, "fr_CA");
    ValueLabelDTO b = new ValueLabelDTO(2L, "fr_FR");
    return Arrays.asList(a, b);
  }

  @PostMapping("/createRegion")
  protected void createRegion(@RequestBody RegionCreateDTO dto) {
    System.out.print(dto.getCountry());
  }
}

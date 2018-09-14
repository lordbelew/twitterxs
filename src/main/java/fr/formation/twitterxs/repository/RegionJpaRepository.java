package fr.formation.twitterxs.repository;

import fr.formation.twitterxs.domain.entities.Region;
import fr.formation.twitterxs.dto.ValueLabelDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegionJpaRepository extends JpaRepository<Region, Long> {

  @Query("select new fr.formation.twitterxs.dto.ValueLabelDTO(r.id, r.language || '_' || r.country) from Region r order by r.country, r.language")
  List<ValueLabelDTO> findAllAsDto();

}

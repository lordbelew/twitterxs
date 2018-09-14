package fr.formation.twitterxs.repository;

import fr.formation.twitterxs.domain.entities.Tweet;
import fr.formation.twitterxs.dto.TweetDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TweetJpaRepository extends JpaRepository<Tweet, Long> {

  @Query("select new fr.formation.twitterxs.dto.TweetDTO(t.id, t.postDate, t.content) from Tweet t where t.author.security.username = :username order by t.postDate desc")
  Page<TweetDTO> findByUsername(@Param("username") String username, Pageable pageable);
}

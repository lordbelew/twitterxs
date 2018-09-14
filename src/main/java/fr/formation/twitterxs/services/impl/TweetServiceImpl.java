package fr.formation.twitterxs.services.impl;

import fr.formation.twitterxs.domain.entities.Tweet;
import fr.formation.twitterxs.domain.entities.User;
import fr.formation.twitterxs.dto.SearchResultDTO;
import fr.formation.twitterxs.dto.TweetCreateDTO;
import fr.formation.twitterxs.dto.TweetDTO;
import fr.formation.twitterxs.dto.TweetSearchDTO;
import fr.formation.twitterxs.repository.TweetJpaRepository;
import fr.formation.twitterxs.repository.UserJpaRepository;
import fr.formation.twitterxs.services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TweetServiceImpl implements TweetService {

  @Autowired
  UserJpaRepository userJpaRepo;

  @Autowired
  TweetJpaRepository tweetJpaRepo;

  @Override
  public void post(TweetCreateDTO dto) {
    User author = userJpaRepo.findById(dto.getAuthorId()).get();
    Tweet tweet = EntityHelper.asTweet(dto, author);
    tweetJpaRepo.save(tweet);
  }

  @Override
  public SearchResultDTO<TweetDTO> feed(TweetSearchDTO dto) {
    Pageable pageable = PageRequest.of(dto.getPage(), dto.getSize());
    Page<TweetDTO> page = tweetJpaRepo.findByUsername(dto.getUsername(), pageable);

    return new SearchResultDTO<>(page.getContent(), page.getTotalElements());
  }

}

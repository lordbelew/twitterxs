package fr.formation.twitterxs.services;

import fr.formation.twitterxs.dto.SearchResultDTO;
import fr.formation.twitterxs.dto.TweetCreateDTO;
import fr.formation.twitterxs.dto.TweetSearchDTO;

public interface TweetService {

  void post(TweetCreateDTO dto);

  SearchResultDTO feed(TweetSearchDTO dto);

}

package fr.formation.twitterxs.controllers;

import fr.formation.twitterxs.dto.SearchResultDTO;
import fr.formation.twitterxs.dto.TweetCreateDTO;
import fr.formation.twitterxs.dto.TweetSearchDTO;
import fr.formation.twitterxs.services.TweetService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
public class TweetController {

  @Autowired
  TweetService tweetService;

  @PostMapping("/create")
  protected void createTweet(@RequestBody @Valid TweetCreateDTO tweet) {
    tweetService.post(tweet);
  }

  @PostMapping("/feed")
  protected SearchResultDTO feed(@RequestBody TweetSearchDTO tweetSearch) {
    return tweetService.feed(tweetSearch);
  }


}

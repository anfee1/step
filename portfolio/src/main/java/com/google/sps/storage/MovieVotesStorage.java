package com.google.sps.storage;

import com.google.sps.data.MovieVotes;
import java.util.Collection;

public interface MovieVotesStorage {
  void createMovieVotes(MovieVotes initial);
  void incrementVote(String movieName);
  Collection<MovieVotes> listMovieVotes();
}

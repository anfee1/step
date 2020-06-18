package com.google.sps.storage;

import com.google.common.collect.ImmutableList;
import com.google.sps.data.MovieVotes;
import com.google.sps.storage.MovieVotesStorage;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryMovieVotesStorage implements MovieVotesStorage {
  private final ConcurrentHashMap<String, MovieVotes> movieVotesByName;

  InMemoryMovieVotesStorage() {
    movieVotesByName = new ConcurrentHashMap<>();
  }

  @Override
  public void createMovieVotes(MovieVotes initial) {
    movieVotesByName.put(initial.movieName, initial);
  }

  @Override
  public void incrementVote(String movieName) {
    movieVotesByName.compute(movieName, (name, existing) -> {
      if (existing == null) {
        return new MovieVotes(movieName, 1);
      }
      return new MovieVotes(movieName, existing.voteCount + 1);
    });
  }

  @Override
  public Collection<MovieVotes> listMovieVotes() {
    return ImmutableList.copyOf(movieVotesByName.values());
  }
}

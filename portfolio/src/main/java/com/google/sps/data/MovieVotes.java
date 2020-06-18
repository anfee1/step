
package com.google.sps.data;

// TODO: Switch to immutable class
public class MovieVotes {
  public String movieName;
  public int voteCount;
  public MovieVotes(String movieName, int voteCount) {
    this.movieName = movieName;
    this.voteCount = voteCount;
  }

  public MovieVotes() {}
}

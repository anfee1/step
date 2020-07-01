package com.google.sps.servlets;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.sps.data.MovieVotes;
import com.google.sps.storage.MovieVotesStorage;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Singleton
public final class MovieVotesServlet extends HttpServlet {
  private final MovieVotesStorage storage;

  @Inject
  public MovieVotesServlet(MovieVotesStorage storage) {
    this.storage = storage;
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json;");
    response.getWriter().print(new Gson().toJson(storage.listMovieVotes()));
  }
}
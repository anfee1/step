package com.google.sps.storage;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Provides in memory implementations of storage interfaces.
 */
public class InMemoryStorageModule extends AbstractModule {
  @Override
  public void configure() {
    bind(MovieVotesStorage.class).to(InMemoryMovieVotesStorage.class).in(Singleton.class);
  }
}
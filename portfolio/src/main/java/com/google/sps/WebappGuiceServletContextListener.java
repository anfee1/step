package com.google.sps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Provides an {@link Injector} configured to serve the SPS application routes.
 * @see https://github.com/google/guice/wiki/ServletModule
 */

public class WebappGuiceServletContextListener extends GuiceServletContextListener {
  @Override
  protected Injector getInjector() {
    return Guice.createInjector(    );
    }
}
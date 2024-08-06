package com.dirzaaulia.footballclips.repository;

import com.dirzaaulia.footballclips.network.ScoreBatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<ScoreBatService> scoreBatServiceProvider;

  public Repository_Factory(Provider<ScoreBatService> scoreBatServiceProvider) {
    this.scoreBatServiceProvider = scoreBatServiceProvider;
  }

  @Override
  public Repository get() {
    return newInstance(scoreBatServiceProvider.get());
  }

  public static Repository_Factory create(Provider<ScoreBatService> scoreBatServiceProvider) {
    return new Repository_Factory(scoreBatServiceProvider);
  }

  public static Repository newInstance(ScoreBatService scoreBatService) {
    return new Repository(scoreBatService);
  }
}

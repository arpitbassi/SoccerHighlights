package com.dirzaaulia.footballclips.di;

import com.dirzaaulia.footballclips.network.ScoreBatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideScoreBatServiceFactory implements Factory<ScoreBatService> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvideScoreBatServiceFactory(NetworkModule module,
      Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public ScoreBatService get() {
    return provideScoreBatService(module, clientProvider.get());
  }

  public static NetworkModule_ProvideScoreBatServiceFactory create(NetworkModule module,
      Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvideScoreBatServiceFactory(module, clientProvider);
  }

  public static ScoreBatService provideScoreBatService(NetworkModule instance,
      OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideScoreBatService(client));
  }
}

package com.example.spotifyclone.di;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideDataSourceFactoryFactory implements Factory<DefaultDataSourceFactory> {
  private final Provider<Context> contextProvider;

  public ServiceModule_ProvideDataSourceFactoryFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DefaultDataSourceFactory get() {
    return provideDataSourceFactory(contextProvider.get());
  }

  public static ServiceModule_ProvideDataSourceFactoryFactory create(
      Provider<Context> contextProvider) {
    return new ServiceModule_ProvideDataSourceFactoryFactory(contextProvider);
  }

  public static DefaultDataSourceFactory provideDataSourceFactory(Context context) {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideDataSourceFactory(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}

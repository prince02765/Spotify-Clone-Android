package com.example.spotifyclone.di;

import android.content.Context;
import com.example.spotifyclone.exoplayer.MusicServiceConnection;
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
public final class AppModule_ProvideMusicServiceConnectionFactory implements Factory<MusicServiceConnection> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideMusicServiceConnectionFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MusicServiceConnection get() {
    return provideMusicServiceConnection(contextProvider.get());
  }

  public static AppModule_ProvideMusicServiceConnectionFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideMusicServiceConnectionFactory(contextProvider);
  }

  public static MusicServiceConnection provideMusicServiceConnection(Context context) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideMusicServiceConnection(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}

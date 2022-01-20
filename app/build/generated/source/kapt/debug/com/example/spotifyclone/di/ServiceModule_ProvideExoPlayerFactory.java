package com.example.spotifyclone.di;

import android.content.Context;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.audio.AudioAttributes;
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
public final class ServiceModule_ProvideExoPlayerFactory implements Factory<SimpleExoPlayer> {
  private final Provider<Context> contextProvider;

  private final Provider<AudioAttributes> audioAttributesProvider;

  public ServiceModule_ProvideExoPlayerFactory(Provider<Context> contextProvider,
      Provider<AudioAttributes> audioAttributesProvider) {
    this.contextProvider = contextProvider;
    this.audioAttributesProvider = audioAttributesProvider;
  }

  @Override
  public SimpleExoPlayer get() {
    return provideExoPlayer(contextProvider.get(), audioAttributesProvider.get());
  }

  public static ServiceModule_ProvideExoPlayerFactory create(Provider<Context> contextProvider,
      Provider<AudioAttributes> audioAttributesProvider) {
    return new ServiceModule_ProvideExoPlayerFactory(contextProvider, audioAttributesProvider);
  }

  public static SimpleExoPlayer provideExoPlayer(Context context, AudioAttributes audioAttributes) {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideExoPlayer(context, audioAttributes), "Cannot return null from a non-@Nullable @Provides method");
  }
}

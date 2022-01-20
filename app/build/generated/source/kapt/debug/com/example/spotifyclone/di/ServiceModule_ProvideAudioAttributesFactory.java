package com.example.spotifyclone.di;

import com.google.android.exoplayer2.audio.AudioAttributes;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideAudioAttributesFactory implements Factory<AudioAttributes> {
  @Override
  public AudioAttributes get() {
    return provideAudioAttributes();
  }

  public static ServiceModule_ProvideAudioAttributesFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AudioAttributes provideAudioAttributes() {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideAudioAttributes(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final ServiceModule_ProvideAudioAttributesFactory INSTANCE = new ServiceModule_ProvideAudioAttributesFactory();
  }
}

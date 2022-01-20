package com.example.spotifyclone.ui.viewmodels;

import com.example.spotifyclone.exoplayer.MusicServiceConnection;
import dagger.internal.Factory;
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
public final class SongViewModel_AssistedFactory_Factory implements Factory<SongViewModel_AssistedFactory> {
  private final Provider<MusicServiceConnection> musicServiceConnectionProvider;

  public SongViewModel_AssistedFactory_Factory(
      Provider<MusicServiceConnection> musicServiceConnectionProvider) {
    this.musicServiceConnectionProvider = musicServiceConnectionProvider;
  }

  @Override
  public SongViewModel_AssistedFactory get() {
    return newInstance(musicServiceConnectionProvider);
  }

  public static SongViewModel_AssistedFactory_Factory create(
      Provider<MusicServiceConnection> musicServiceConnectionProvider) {
    return new SongViewModel_AssistedFactory_Factory(musicServiceConnectionProvider);
  }

  public static SongViewModel_AssistedFactory newInstance(
      Provider<MusicServiceConnection> musicServiceConnection) {
    return new SongViewModel_AssistedFactory(musicServiceConnection);
  }
}

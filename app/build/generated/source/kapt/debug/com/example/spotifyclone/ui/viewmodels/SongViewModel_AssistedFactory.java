package com.example.spotifyclone.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.spotifyclone.exoplayer.MusicServiceConnection;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SongViewModel_AssistedFactory implements ViewModelAssistedFactory<SongViewModel> {
  private final Provider<MusicServiceConnection> musicServiceConnection;

  @Inject
  SongViewModel_AssistedFactory(Provider<MusicServiceConnection> musicServiceConnection) {
    this.musicServiceConnection = musicServiceConnection;
  }

  @Override
  @NonNull
  public SongViewModel create(SavedStateHandle arg0) {
    return new SongViewModel(musicServiceConnection.get());
  }
}

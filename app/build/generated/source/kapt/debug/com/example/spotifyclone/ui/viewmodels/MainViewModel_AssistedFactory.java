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
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<MusicServiceConnection> musicServiceConnection;

  @Inject
  MainViewModel_AssistedFactory(Provider<MusicServiceConnection> musicServiceConnection) {
    this.musicServiceConnection = musicServiceConnection;
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel(musicServiceConnection.get());
  }
}

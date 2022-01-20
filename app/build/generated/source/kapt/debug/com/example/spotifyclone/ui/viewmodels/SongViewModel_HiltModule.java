package com.example.spotifyclone.ui.viewmodels;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = SongViewModel.class
)
public interface SongViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.spotifyclone.ui.viewmodels.SongViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(SongViewModel_AssistedFactory factory);
}

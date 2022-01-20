package com.plcoding.spotifycloneyt.adapters;

import com.bumptech.glide.RequestManager;
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
public final class SongAdapter_Factory implements Factory<SongAdapter> {
  private final Provider<RequestManager> glideProvider;

  public SongAdapter_Factory(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  @Override
  public SongAdapter get() {
    return newInstance(glideProvider.get());
  }

  public static SongAdapter_Factory create(Provider<RequestManager> glideProvider) {
    return new SongAdapter_Factory(glideProvider);
  }

  public static SongAdapter newInstance(RequestManager glide) {
    return new SongAdapter(glide);
  }
}

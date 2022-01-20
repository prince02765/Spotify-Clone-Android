package com.example.spotifyclone.ui.fragments;

import com.bumptech.glide.RequestManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class SongFragment_MembersInjector implements MembersInjector<SongFragment> {
  private final Provider<RequestManager> glideProvider;

  public SongFragment_MembersInjector(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  public static MembersInjector<SongFragment> create(Provider<RequestManager> glideProvider) {
    return new SongFragment_MembersInjector(glideProvider);
  }

  @Override
  public void injectMembers(SongFragment instance) {
    injectGlide(instance, glideProvider.get());
  }

  @InjectedFieldSignature("com.example.spotifyclone.ui.fragments.SongFragment.glide")
  public static void injectGlide(SongFragment instance, RequestManager glide) {
    instance.glide = glide;
  }
}

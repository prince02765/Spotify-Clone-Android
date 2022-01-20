package com.example.spotifyclone.exoplayer;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
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
public final class MusicService_MembersInjector implements MembersInjector<MusicService> {
  private final Provider<DefaultDataSourceFactory> dataSourceFactoryProvider;

  private final Provider<SimpleExoPlayer> exoPlayerProvider;

  private final Provider<FirebaseMusicSource> firebaseMusicSourceProvider;

  public MusicService_MembersInjector(Provider<DefaultDataSourceFactory> dataSourceFactoryProvider,
      Provider<SimpleExoPlayer> exoPlayerProvider,
      Provider<FirebaseMusicSource> firebaseMusicSourceProvider) {
    this.dataSourceFactoryProvider = dataSourceFactoryProvider;
    this.exoPlayerProvider = exoPlayerProvider;
    this.firebaseMusicSourceProvider = firebaseMusicSourceProvider;
  }

  public static MembersInjector<MusicService> create(
      Provider<DefaultDataSourceFactory> dataSourceFactoryProvider,
      Provider<SimpleExoPlayer> exoPlayerProvider,
      Provider<FirebaseMusicSource> firebaseMusicSourceProvider) {
    return new MusicService_MembersInjector(dataSourceFactoryProvider, exoPlayerProvider, firebaseMusicSourceProvider);
  }

  @Override
  public void injectMembers(MusicService instance) {
    injectDataSourceFactory(instance, dataSourceFactoryProvider.get());
    injectExoPlayer(instance, exoPlayerProvider.get());
    injectFirebaseMusicSource(instance, firebaseMusicSourceProvider.get());
  }

  @InjectedFieldSignature("com.example.spotifyclone.exoplayer.MusicService.dataSourceFactory")
  public static void injectDataSourceFactory(MusicService instance,
      DefaultDataSourceFactory dataSourceFactory) {
    instance.dataSourceFactory = dataSourceFactory;
  }

  @InjectedFieldSignature("com.example.spotifyclone.exoplayer.MusicService.exoPlayer")
  public static void injectExoPlayer(MusicService instance, SimpleExoPlayer exoPlayer) {
    instance.exoPlayer = exoPlayer;
  }

  @InjectedFieldSignature("com.example.spotifyclone.exoplayer.MusicService.firebaseMusicSource")
  public static void injectFirebaseMusicSource(MusicService instance,
      FirebaseMusicSource firebaseMusicSource) {
    instance.firebaseMusicSource = firebaseMusicSource;
  }
}

package com.example.spotifyclone.exoplayer;

import com.example.spotifyclone.data.remote.MusicDatabase;
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
public final class FirebaseMusicSource_Factory implements Factory<FirebaseMusicSource> {
  private final Provider<MusicDatabase> musicDatabaseProvider;

  public FirebaseMusicSource_Factory(Provider<MusicDatabase> musicDatabaseProvider) {
    this.musicDatabaseProvider = musicDatabaseProvider;
  }

  @Override
  public FirebaseMusicSource get() {
    return newInstance(musicDatabaseProvider.get());
  }

  public static FirebaseMusicSource_Factory create(Provider<MusicDatabase> musicDatabaseProvider) {
    return new FirebaseMusicSource_Factory(musicDatabaseProvider);
  }

  public static FirebaseMusicSource newInstance(MusicDatabase musicDatabase) {
    return new FirebaseMusicSource(musicDatabase);
  }
}

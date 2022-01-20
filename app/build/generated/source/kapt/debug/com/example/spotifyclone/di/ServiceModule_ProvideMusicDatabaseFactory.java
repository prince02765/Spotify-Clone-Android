package com.example.spotifyclone.di;

import com.example.spotifyclone.data.remote.MusicDatabase;
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
public final class ServiceModule_ProvideMusicDatabaseFactory implements Factory<MusicDatabase> {
  @Override
  public MusicDatabase get() {
    return provideMusicDatabase();
  }

  public static ServiceModule_ProvideMusicDatabaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MusicDatabase provideMusicDatabase() {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideMusicDatabase(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final ServiceModule_ProvideMusicDatabaseFactory INSTANCE = new ServiceModule_ProvideMusicDatabaseFactory();
  }
}

package com.example.spotifyclone.exoplayer;

import androidx.annotation.CallSuper;
import androidx.media.MediaBrowserServiceCompat;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.ServiceGenerator")
public abstract class Hilt_MusicService extends MediaBrowserServiceCompat implements GeneratedComponentManager<Object> {
  private volatile ServiceComponentManager componentManager;

  private final Object componentManagerLock = new Object();

  Hilt_MusicService() {
    super();
  }

  @CallSuper
  @Override
  public void onCreate() {
    inject();
    super.onCreate();
  }

  protected ServiceComponentManager createComponentManager() {
    return new ServiceComponentManager(this);
  }

  protected final ServiceComponentManager componentManager() {
    if (componentManager == null) {
      synchronized (componentManagerLock) {
        if (componentManager == null) {
          componentManager = createComponentManager();
        }
      }
    }
    return componentManager;
  }

  protected void inject() {
    ((MusicService_GeneratedInjector) generatedComponent()).injectMusicService(UnsafeCasts.<MusicService>unsafeCast(this));
  }

  @Override
  public final Object generatedComponent() {
    return componentManager().generatedComponent();
  }
}

package com.example.spotifyclone;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.example.spotifyclone.data.remote.MusicDatabase;
import com.example.spotifyclone.di.AppModule;
import com.example.spotifyclone.di.AppModule_ProvideGlideInstanceFactory;
import com.example.spotifyclone.di.AppModule_ProvideMusicServiceConnectionFactory;
import com.example.spotifyclone.di.AppModule_ProvideSwipeSongAdapterFactory;
import com.example.spotifyclone.di.ServiceModule_ProvideAudioAttributesFactory;
import com.example.spotifyclone.di.ServiceModule_ProvideDataSourceFactoryFactory;
import com.example.spotifyclone.di.ServiceModule_ProvideExoPlayerFactory;
import com.example.spotifyclone.di.ServiceModule_ProvideMusicDatabaseFactory;
import com.example.spotifyclone.exoplayer.FirebaseMusicSource;
import com.example.spotifyclone.exoplayer.MusicService;
import com.example.spotifyclone.exoplayer.MusicServiceConnection;
import com.example.spotifyclone.exoplayer.MusicService_MembersInjector;
import com.example.spotifyclone.ui.MainActivity;
import com.example.spotifyclone.ui.MainActivity_MembersInjector;
import com.example.spotifyclone.ui.fragments.HomeFragment;
import com.example.spotifyclone.ui.fragments.HomeFragment_MembersInjector;
import com.example.spotifyclone.ui.fragments.SongFragment;
import com.example.spotifyclone.ui.fragments.SongFragment_MembersInjector;
import com.example.spotifyclone.ui.viewmodels.MainViewModel_AssistedFactory;
import com.example.spotifyclone.ui.viewmodels.MainViewModel_AssistedFactory_Factory;
import com.example.spotifyclone.ui.viewmodels.SongViewModel_AssistedFactory;
import com.example.spotifyclone.ui.viewmodels.SongViewModel_AssistedFactory_Factory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.plcoding.spotifycloneyt.adapters.SongAdapter;
import com.plcoding.spotifycloneyt.adapters.SwipeSongAdapter;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
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
public final class DaggerSpotifyApplication_HiltComponents_ApplicationC extends SpotifyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object swipeSongAdapter = new MemoizedSentinel();

  private volatile Object requestManager = new MemoizedSentinel();

  private volatile Object musicServiceConnection = new MemoizedSentinel();

  private volatile Provider<MusicServiceConnection> provideMusicServiceConnectionProvider;

  private DaggerSpotifyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private SwipeSongAdapter getSwipeSongAdapter() {
    Object local = swipeSongAdapter;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = swipeSongAdapter;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideSwipeSongAdapterFactory.provideSwipeSongAdapter();
          swipeSongAdapter = DoubleCheck.reentrantCheck(swipeSongAdapter, local);
        }
      }
    }
    return (SwipeSongAdapter) local;
  }

  private RequestManager getRequestManager() {
    Object local = requestManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = requestManager;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideGlideInstanceFactory.provideGlideInstance(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          requestManager = DoubleCheck.reentrantCheck(requestManager, local);
        }
      }
    }
    return (RequestManager) local;
  }

  private MusicServiceConnection getMusicServiceConnection() {
    Object local = musicServiceConnection;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = musicServiceConnection;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideMusicServiceConnectionFactory.provideMusicServiceConnection(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          musicServiceConnection = DoubleCheck.reentrantCheck(musicServiceConnection, local);
        }
      }
    }
    return (MusicServiceConnection) local;
  }

  private Provider<MusicServiceConnection> getMusicServiceConnectionProvider() {
    Object local = provideMusicServiceConnectionProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideMusicServiceConnectionProvider = (Provider<MusicServiceConnection>) local;
    }
    return (Provider<MusicServiceConnection>) local;
  }

  @Override
  public void injectSpotifyApplication(SpotifyApplication spotifyApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public SpotifyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerSpotifyApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements SpotifyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public SpotifyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends SpotifyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements SpotifyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public SpotifyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends SpotifyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<SongViewModel_AssistedFactory> songViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getMusicServiceConnectionProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private SongViewModel_AssistedFactory getSongViewModel_AssistedFactory() {
        return SongViewModel_AssistedFactory_Factory.newInstance(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getMusicServiceConnectionProvider());
      }

      private Provider<SongViewModel_AssistedFactory> getSongViewModel_AssistedFactoryProvider() {
        Object local = songViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          songViewModel_AssistedFactoryProvider = (Provider<SongViewModel_AssistedFactory>) local;
        }
        return (Provider<SongViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return ImmutableMap.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>of("com.example.spotifyclone.ui.viewmodels.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider(), "com.example.spotifyclone.ui.viewmodels.SongViewModel", (Provider) getSongViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
        injectMainActivity2(arg0);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @CanIgnoreReturnValue
      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectSwipeSongAdapter(instance, DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getSwipeSongAdapter());
        MainActivity_MembersInjector.injectGlide(instance, DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getRequestManager());
        return instance;
      }

      private final class FragmentCBuilder implements SpotifyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public SpotifyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends SpotifyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private SongAdapter getSongAdapter() {
          return new SongAdapter(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getRequestManager());
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectHomeFragment(HomeFragment arg0) {
          injectHomeFragment2(arg0);
        }

        @Override
        public void injectSongFragment(SongFragment songFragment) {
          injectSongFragment2(songFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        @CanIgnoreReturnValue
        private HomeFragment injectHomeFragment2(HomeFragment instance) {
          HomeFragment_MembersInjector.injectSongAdapter(instance, getSongAdapter());
          return instance;
        }

        @CanIgnoreReturnValue
        private SongFragment injectSongFragment2(SongFragment instance) {
          SongFragment_MembersInjector.injectGlide(instance, DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getRequestManager());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements SpotifyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public SpotifyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends SpotifyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements SpotifyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public SpotifyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends SpotifyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.spotifyclone.ui.viewmodels.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 1: // com.example.spotifyclone.ui.viewmodels.SongViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSongViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements SpotifyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public SpotifyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends SpotifyApplication_HiltComponents.ServiceC {
    private volatile Object defaultDataSourceFactory = new MemoizedSentinel();

    private volatile Object audioAttributes = new MemoizedSentinel();

    private volatile Object simpleExoPlayer = new MemoizedSentinel();

    private volatile Object musicDatabase = new MemoizedSentinel();

    private ServiceCImpl(Service service) {

    }

    private DefaultDataSourceFactory getDefaultDataSourceFactory() {
      Object local = defaultDataSourceFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = defaultDataSourceFactory;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideDataSourceFactoryFactory.provideDataSourceFactory(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.applicationContextModule));
            defaultDataSourceFactory = DoubleCheck.reentrantCheck(defaultDataSourceFactory, local);
          }
        }
      }
      return (DefaultDataSourceFactory) local;
    }

    private AudioAttributes getAudioAttributes() {
      Object local = audioAttributes;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = audioAttributes;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideAudioAttributesFactory.provideAudioAttributes();
            audioAttributes = DoubleCheck.reentrantCheck(audioAttributes, local);
          }
        }
      }
      return (AudioAttributes) local;
    }

    private SimpleExoPlayer getSimpleExoPlayer() {
      Object local = simpleExoPlayer;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = simpleExoPlayer;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideExoPlayerFactory.provideExoPlayer(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerSpotifyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getAudioAttributes());
            simpleExoPlayer = DoubleCheck.reentrantCheck(simpleExoPlayer, local);
          }
        }
      }
      return (SimpleExoPlayer) local;
    }

    private MusicDatabase getMusicDatabase() {
      Object local = musicDatabase;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = musicDatabase;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideMusicDatabaseFactory.provideMusicDatabase();
            musicDatabase = DoubleCheck.reentrantCheck(musicDatabase, local);
          }
        }
      }
      return (MusicDatabase) local;
    }

    private FirebaseMusicSource getFirebaseMusicSource() {
      return new FirebaseMusicSource(getMusicDatabase());
    }

    @Override
    public void injectMusicService(MusicService arg0) {
      injectMusicService2(arg0);
    }

    @CanIgnoreReturnValue
    private MusicService injectMusicService2(MusicService instance) {
      MusicService_MembersInjector.injectDataSourceFactory(instance, getDefaultDataSourceFactory());
      MusicService_MembersInjector.injectExoPlayer(instance, getSimpleExoPlayer());
      MusicService_MembersInjector.injectFirebaseMusicSource(instance, getFirebaseMusicSource());
      return instance;
    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.spotifyclone.exoplayer.MusicServiceConnection 
        return (T) DaggerSpotifyApplication_HiltComponents_ApplicationC.this.getMusicServiceConnection();

        default: throw new AssertionError(id);
      }
    }
  }
}

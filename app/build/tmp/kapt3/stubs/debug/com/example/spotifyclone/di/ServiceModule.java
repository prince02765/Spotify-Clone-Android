package com.example.spotifyclone.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ServiceComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/spotifyclone/di/ServiceModule;", "", "()V", "provideAudioAttributes", "Lcom/google/android/exoplayer2/audio/AudioAttributes;", "provideDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "context", "Landroid/content/Context;", "provideExoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "audioAttributes", "provideMusicDatabase", "Lcom/example/spotifyclone/data/remote/MusicDatabase;", "app_debug"})
@dagger.Module()
public final class ServiceModule {
    public static final com.example.spotifyclone.di.ServiceModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final com.example.spotifyclone.data.remote.MusicDatabase provideMusicDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final com.google.android.exoplayer2.audio.AudioAttributes provideAudioAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final com.google.android.exoplayer2.SimpleExoPlayer provideExoPlayer(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final com.google.android.exoplayer2.upstream.DefaultDataSourceFactory provideDataSourceFactory(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    private ServiceModule() {
        super();
    }
}
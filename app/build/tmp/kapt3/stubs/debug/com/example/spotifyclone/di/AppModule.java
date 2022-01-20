package com.example.spotifyclone.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/spotifyclone/di/AppModule;", "", "()V", "provideGlideInstance", "Lcom/bumptech/glide/RequestManager;", "context", "Landroid/content/Context;", "provideMusicServiceConnection", "Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;", "provideSwipeSongAdapter", "Lcom/plcoding/spotifycloneyt/adapters/SwipeSongAdapter;", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.example.spotifyclone.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.spotifyclone.exoplayer.MusicServiceConnection provideMusicServiceConnection(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.plcoding.spotifycloneyt.adapters.SwipeSongAdapter provideSwipeSongAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager provideGlideInstance(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}
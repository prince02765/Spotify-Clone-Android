package com.example.spotifyclone.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/example/spotifyclone/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "curPlayingSong", "Lcom/example/spotifyclone/data/entities/Song;", "glide", "Lcom/bumptech/glide/RequestManager;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "setGlide", "(Lcom/bumptech/glide/RequestManager;)V", "mainViewModel", "Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "swipeSongAdapter", "Lcom/plcoding/spotifycloneyt/adapters/SwipeSongAdapter;", "getSwipeSongAdapter", "()Lcom/plcoding/spotifycloneyt/adapters/SwipeSongAdapter;", "setSwipeSongAdapter", "(Lcom/plcoding/spotifycloneyt/adapters/SwipeSongAdapter;)V", "hideBottomBar", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBottomBar", "subscribeToObservers", "switchViewPagerToCurrentSong", "song", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.plcoding.spotifycloneyt.adapters.SwipeSongAdapter swipeSongAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager glide;
    private com.example.spotifyclone.data.entities.Song curPlayingSong;
    private android.support.v4.media.session.PlaybackStateCompat playbackState;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.spotifyclone.ui.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.plcoding.spotifycloneyt.adapters.SwipeSongAdapter getSwipeSongAdapter() {
        return null;
    }
    
    public final void setSwipeSongAdapter(@org.jetbrains.annotations.NotNull()
    com.plcoding.spotifycloneyt.adapters.SwipeSongAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    public final void setGlide(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideBottomBar() {
    }
    
    private final void showBottomBar() {
    }
    
    private final void switchViewPagerToCurrentSong(com.example.spotifyclone.data.entities.Song song) {
    }
    
    private final void subscribeToObservers() {
    }
    
    public MainActivity() {
        super();
    }
}
package com.example.spotifyclone.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u0011J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020\u001aR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "musicServiceConnection", "Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;", "(Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;)V", "_mediaItems", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/spotifyclone/other/Resource;", "", "Lcom/example/spotifyclone/data/entities/Song;", "curPlayingSong", "Landroidx/lifecycle/LiveData;", "Landroid/support/v4/media/MediaMetadataCompat;", "getCurPlayingSong", "()Landroidx/lifecycle/LiveData;", "isConnected", "Lcom/example/spotifyclone/other/Event;", "", "mediaItems", "getMediaItems", "networkError", "getNetworkError", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "getPlaybackState", "onCleared", "", "playOrToggleSong", "mediaItem", "toggle", "seekTo", "pos", "", "skipToNextSong", "skipToPreviousSong", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.spotifyclone.other.Resource<java.util.List<com.example.spotifyclone.data.entities.Song>>> _mediaItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Resource<java.util.List<com.example.spotifyclone.data.entities.Song>>> mediaItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> isConnected = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> networkError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.support.v4.media.MediaMetadataCompat> curPlayingSong = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.support.v4.media.session.PlaybackStateCompat> playbackState = null;
    private final com.example.spotifyclone.exoplayer.MusicServiceConnection musicServiceConnection = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Resource<java.util.List<com.example.spotifyclone.data.entities.Song>>> getMediaItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> isConnected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> getNetworkError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.support.v4.media.MediaMetadataCompat> getCurPlayingSong() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.support.v4.media.session.PlaybackStateCompat> getPlaybackState() {
        return null;
    }
    
    public final void skipToNextSong() {
    }
    
    public final void skipToPreviousSong() {
    }
    
    public final void seekTo(long pos) {
    }
    
    public final void playOrToggleSong(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.data.entities.Song mediaItem, boolean toggle) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.exoplayer.MusicServiceConnection musicServiceConnection) {
        super();
    }
}
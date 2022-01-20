package com.example.spotifyclone.exoplayer.callbacks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/spotifyclone/exoplayer/callbacks/MusicPlayerEventListener;", "Lcom/google/android/exoplayer2/Player$EventListener;", "musicService", "Lcom/example/spotifyclone/exoplayer/MusicService;", "(Lcom/example/spotifyclone/exoplayer/MusicService;)V", "onPlayerError", "", "error", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onPlayerStateChanged", "playWhenReady", "", "playbackState", "", "app_debug"})
public final class MusicPlayerEventListener implements com.google.android.exoplayer2.Player.EventListener {
    private final com.example.spotifyclone.exoplayer.MusicService musicService = null;
    
    @java.lang.Override()
    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
    }
    
    @java.lang.Override()
    public void onPlayerError(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlaybackException error) {
    }
    
    public MusicPlayerEventListener(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.exoplayer.MusicService musicService) {
        super();
    }
}
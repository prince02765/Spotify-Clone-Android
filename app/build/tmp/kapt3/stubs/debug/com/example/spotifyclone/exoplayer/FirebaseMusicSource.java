package com.example.spotifyclone.exoplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0011\u0010\u001c\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/example/spotifyclone/exoplayer/FirebaseMusicSource;", "", "musicDatabase", "Lcom/example/spotifyclone/data/remote/MusicDatabase;", "(Lcom/example/spotifyclone/data/remote/MusicDatabase;)V", "onReadyListeners", "", "Lkotlin/Function1;", "", "", "songs", "", "Landroid/support/v4/media/MediaMetadataCompat;", "getSongs", "()Ljava/util/List;", "setSongs", "(Ljava/util/List;)V", "value", "Lcom/example/spotifyclone/exoplayer/State;", "state", "setState", "(Lcom/example/spotifyclone/exoplayer/State;)V", "asMediaItems", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "asMediaSource", "Lcom/google/android/exoplayer2/source/ConcatenatingMediaSource;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "fetchMediaData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenReady", "action", "app_debug"})
public final class FirebaseMusicSource {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<android.support.v4.media.MediaMetadataCompat> songs;
    private final java.util.List<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> onReadyListeners = null;
    private com.example.spotifyclone.exoplayer.State state = com.example.spotifyclone.exoplayer.State.STATE_CREATED;
    private final com.example.spotifyclone.data.remote.MusicDatabase musicDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.support.v4.media.MediaMetadataCompat> getSongs() {
        return null;
    }
    
    public final void setSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<android.support.v4.media.MediaMetadataCompat> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMediaData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.source.ConcatenatingMediaSource asMediaSource(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.upstream.DefaultDataSourceFactory dataSourceFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> asMediaItems() {
        return null;
    }
    
    private final void setState(com.example.spotifyclone.exoplayer.State value) {
    }
    
    public final boolean whenReady(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> action) {
        return false;
    }
    
    @javax.inject.Inject()
    public FirebaseMusicSource(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.data.remote.MusicDatabase musicDatabase) {
        super();
    }
}
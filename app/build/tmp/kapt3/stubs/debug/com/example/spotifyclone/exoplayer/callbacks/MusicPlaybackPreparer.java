package com.example.spotifyclone.exoplayer.callbacks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J4\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0016J\"\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/spotifyclone/exoplayer/callbacks/MusicPlaybackPreparer;", "Lcom/google/android/exoplayer2/ext/mediasession/MediaSessionConnector$PlaybackPreparer;", "firebaseMusicSource", "Lcom/example/spotifyclone/exoplayer/FirebaseMusicSource;", "playerPrepared", "Lkotlin/Function1;", "Landroid/support/v4/media/MediaMetadataCompat;", "", "(Lcom/example/spotifyclone/exoplayer/FirebaseMusicSource;Lkotlin/jvm/functions/Function1;)V", "getSupportedPrepareActions", "", "onCommand", "", "player", "Lcom/google/android/exoplayer2/Player;", "controlDispatcher", "Lcom/google/android/exoplayer2/ControlDispatcher;", "command", "", "extras", "Landroid/os/Bundle;", "cb", "Landroid/os/ResultReceiver;", "onPrepare", "playWhenReady", "onPrepareFromMediaId", "mediaId", "onPrepareFromSearch", "query", "onPrepareFromUri", "uri", "Landroid/net/Uri;", "app_debug"})
public final class MusicPlaybackPreparer implements com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.PlaybackPreparer {
    private final com.example.spotifyclone.exoplayer.FirebaseMusicSource firebaseMusicSource = null;
    private final kotlin.jvm.functions.Function1<android.support.v4.media.MediaMetadataCompat, kotlin.Unit> playerPrepared = null;
    
    @java.lang.Override()
    public boolean onCommand(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ControlDispatcher controlDispatcher, @org.jetbrains.annotations.NotNull()
    java.lang.String command, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver cb) {
        return false;
    }
    
    @java.lang.Override()
    public long getSupportedPrepareActions() {
        return 0L;
    }
    
    @java.lang.Override()
    public void onPrepare(boolean playWhenReady) {
    }
    
    @java.lang.Override()
    public void onPrepareFromMediaId(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, boolean playWhenReady, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPrepareFromSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query, boolean playWhenReady, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPrepareFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean playWhenReady, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    public MusicPlaybackPreparer(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.exoplayer.FirebaseMusicSource firebaseMusicSource, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.support.v4.media.MediaMetadataCompat, kotlin.Unit> playerPrepared) {
        super();
    }
}
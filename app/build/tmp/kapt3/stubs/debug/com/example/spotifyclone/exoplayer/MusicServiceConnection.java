package com.example.spotifyclone.exoplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002-.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006/"}, d2 = {"Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_curPlayingSong", "Landroidx/lifecycle/MutableLiveData;", "Landroid/support/v4/media/MediaMetadataCompat;", "_isConnected", "Lcom/example/spotifyclone/other/Event;", "Lcom/example/spotifyclone/other/Resource;", "", "_networkError", "_playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "curPlayingSong", "Landroidx/lifecycle/LiveData;", "getCurPlayingSong", "()Landroidx/lifecycle/LiveData;", "isConnected", "mediaBrowser", "Landroid/support/v4/media/MediaBrowserCompat;", "mediaBrowserConnectionCallback", "Lcom/example/spotifyclone/exoplayer/MusicServiceConnection$MediaBrowserConnectionCallback;", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "getMediaController", "()Landroid/support/v4/media/session/MediaControllerCompat;", "setMediaController", "(Landroid/support/v4/media/session/MediaControllerCompat;)V", "networkError", "getNetworkError", "playbackState", "getPlaybackState", "transportControls", "Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;", "getTransportControls", "()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;", "subscribe", "", "parentId", "", "callback", "Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;", "unsubscribe", "MediaBrowserConnectionCallback", "MediaContollerCallback", "app_debug"})
public final class MusicServiceConnection {
    private final androidx.lifecycle.MutableLiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> _isConnected = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> isConnected = null;
    private final androidx.lifecycle.MutableLiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> _networkError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> networkError = null;
    private final androidx.lifecycle.MutableLiveData<android.support.v4.media.session.PlaybackStateCompat> _playbackState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.support.v4.media.session.PlaybackStateCompat> playbackState = null;
    private final androidx.lifecycle.MutableLiveData<android.support.v4.media.MediaMetadataCompat> _curPlayingSong = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.support.v4.media.MediaMetadataCompat> curPlayingSong = null;
    @org.jetbrains.annotations.NotNull()
    public android.support.v4.media.session.MediaControllerCompat mediaController;
    private final com.example.spotifyclone.exoplayer.MusicServiceConnection.MediaBrowserConnectionCallback mediaBrowserConnectionCallback = null;
    private final android.support.v4.media.MediaBrowserCompat mediaBrowser = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> isConnected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.spotifyclone.other.Event<com.example.spotifyclone.other.Resource<java.lang.Boolean>>> getNetworkError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.support.v4.media.session.PlaybackStateCompat> getPlaybackState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.support.v4.media.MediaMetadataCompat> getCurPlayingSong() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.media.session.MediaControllerCompat getMediaController() {
        return null;
    }
    
    public final void setMediaController(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaControllerCompat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
        return null;
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaBrowserCompat.SubscriptionCallback callback) {
    }
    
    public final void unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaBrowserCompat.SubscriptionCallback callback) {
    }
    
    public MusicServiceConnection(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/spotifyclone/exoplayer/MusicServiceConnection$MediaBrowserConnectionCallback;", "Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;", "context", "Landroid/content/Context;", "(Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;Landroid/content/Context;)V", "onConnected", "", "onConnectionFailed", "onConnectionSuspended", "app_debug"})
    final class MediaBrowserConnectionCallback extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback {
        private final android.content.Context context = null;
        
        @java.lang.Override()
        public void onConnected() {
        }
        
        @java.lang.Override()
        public void onConnectionSuspended() {
        }
        
        @java.lang.Override()
        public void onConnectionFailed() {
        }
        
        public MediaBrowserConnectionCallback(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/spotifyclone/exoplayer/MusicServiceConnection$MediaContollerCallback;", "Landroid/support/v4/media/session/MediaControllerCompat$Callback;", "(Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;)V", "onMetadataChanged", "", "metadata", "Landroid/support/v4/media/MediaMetadataCompat;", "onPlaybackStateChanged", "state", "Landroid/support/v4/media/session/PlaybackStateCompat;", "onSessionDestroyed", "onSessionEvent", "event", "", "extras", "Landroid/os/Bundle;", "app_debug"})
    final class MediaContollerCallback extends android.support.v4.media.session.MediaControllerCompat.Callback {
        
        @java.lang.Override()
        public void onPlaybackStateChanged(@org.jetbrains.annotations.Nullable()
        android.support.v4.media.session.PlaybackStateCompat state) {
        }
        
        @java.lang.Override()
        public void onMetadataChanged(@org.jetbrains.annotations.Nullable()
        android.support.v4.media.MediaMetadataCompat metadata) {
        }
        
        @java.lang.Override()
        public void onSessionEvent(@org.jetbrains.annotations.Nullable()
        java.lang.String event, @org.jetbrains.annotations.Nullable()
        android.os.Bundle extras) {
        }
        
        @java.lang.Override()
        public void onSessionDestroyed() {
        }
        
        public MediaContollerCallback() {
            super();
        }
    }
}
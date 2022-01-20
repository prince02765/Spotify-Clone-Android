package com.example.spotifyclone.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/spotifyclone/ui/viewmodels/SongViewModel;", "Landroidx/lifecycle/ViewModel;", "musicServiceConnection", "Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;", "(Lcom/example/spotifyclone/exoplayer/MusicServiceConnection;)V", "_curPlayerPosition", "Landroidx/lifecycle/MutableLiveData;", "", "_curSongDuration", "curPlayerPosition", "Landroidx/lifecycle/LiveData;", "getCurPlayerPosition", "()Landroidx/lifecycle/LiveData;", "curSongDuration", "getCurSongDuration", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "updateCurrentPlayerPosition", "", "app_debug"})
public final class SongViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.LiveData<android.support.v4.media.session.PlaybackStateCompat> playbackState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _curSongDuration = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> curSongDuration = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _curPlayerPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> curPlayerPosition = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getCurSongDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getCurPlayerPosition() {
        return null;
    }
    
    private final void updateCurrentPlayerPosition() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SongViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.exoplayer.MusicServiceConnection musicServiceConnection) {
        super();
    }
}
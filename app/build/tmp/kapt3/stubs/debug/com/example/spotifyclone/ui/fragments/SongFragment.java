package com.example.spotifyclone.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/example/spotifyclone/ui/fragments/SongFragment;", "Landroidx/fragment/app/Fragment;", "()V", "curPlayingSong", "Lcom/example/spotifyclone/data/entities/Song;", "glide", "Lcom/bumptech/glide/RequestManager;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "setGlide", "(Lcom/bumptech/glide/RequestManager;)V", "mainViewModel", "Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "shouldUpdateSeekbar", "", "songViewModel", "Lcom/example/spotifyclone/ui/viewmodels/SongViewModel;", "getSongViewModel", "()Lcom/example/spotifyclone/ui/viewmodels/SongViewModel;", "songViewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setCurPlayerTimeToTextView", "ms", "", "subscribeToObservers", "updateTitleAndSongImage", "song", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SongFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager glide;
    private com.example.spotifyclone.ui.viewmodels.MainViewModel mainViewModel;
    private final kotlin.Lazy songViewModel$delegate = null;
    private com.example.spotifyclone.data.entities.Song curPlayingSong;
    private android.support.v4.media.session.PlaybackStateCompat playbackState;
    private boolean shouldUpdateSeekbar = true;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    public final void setGlide(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    private final com.example.spotifyclone.ui.viewmodels.SongViewModel getSongViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateTitleAndSongImage(com.example.spotifyclone.data.entities.Song song) {
    }
    
    private final void subscribeToObservers() {
    }
    
    private final void setCurPlayerTimeToTextView(long ms) {
    }
    
    public SongFragment() {
        super();
    }
}
package com.example.spotifyclone.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/spotifyclone/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mainViewModel", "Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;", "setMainViewModel", "(Lcom/example/spotifyclone/ui/viewmodels/MainViewModel;)V", "songAdapter", "Lcom/plcoding/spotifycloneyt/adapters/SongAdapter;", "getSongAdapter", "()Lcom/plcoding/spotifycloneyt/adapters/SongAdapter;", "setSongAdapter", "(Lcom/plcoding/spotifycloneyt/adapters/SongAdapter;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "subscribeToObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.example.spotifyclone.ui.viewmodels.MainViewModel mainViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.plcoding.spotifycloneyt.adapters.SongAdapter songAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.spotifyclone.ui.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.ui.viewmodels.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.plcoding.spotifycloneyt.adapters.SongAdapter getSongAdapter() {
        return null;
    }
    
    public final void setSongAdapter(@org.jetbrains.annotations.NotNull()
    com.plcoding.spotifycloneyt.adapters.SongAdapter p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupRecyclerView() {
        return null;
    }
    
    private final void subscribeToObservers() {
    }
    
    public HomeFragment() {
        super();
    }
}
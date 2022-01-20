package com.plcoding.spotifycloneyt.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/spotifycloneyt/adapters/SongAdapter;", "Lcom/plcoding/spotifycloneyt/adapters/BaseSongAdapter;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/spotifyclone/data/entities/Song;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onBindViewHolder", "", "holder", "Lcom/plcoding/spotifycloneyt/adapters/BaseSongAdapter$SongViewHolder;", "position", "", "app_debug"})
public final class SongAdapter extends com.plcoding.spotifycloneyt.adapters.BaseSongAdapter {
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.spotifyclone.data.entities.Song> differ = null;
    private final com.bumptech.glide.RequestManager glide = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.AsyncListDiffer<com.example.spotifyclone.data.entities.Song> getDiffer() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.plcoding.spotifycloneyt.adapters.BaseSongAdapter.SongViewHolder holder, int position) {
    }
    
    @javax.inject.Inject()
    public SongAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super(0);
    }
}
package com.plcoding.spotifycloneyt.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0016J\u001a\u0010\"\u001a\u00020\u00112\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006%"}, d2 = {"Lcom/plcoding/spotifycloneyt/adapters/BaseSongAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/plcoding/spotifycloneyt/adapters/BaseSongAdapter$SongViewHolder;", "layoutId", "", "(I)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/spotifyclone/data/entities/Song;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onItemClickListener", "Lkotlin/Function1;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "songs", "getSongs", "()Ljava/util/List;", "setSongs", "(Ljava/util/List;)V", "getItemCount", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemClickListener", "listener", "SongViewHolder", "app_debug"})
public abstract class BaseSongAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.plcoding.spotifycloneyt.adapters.BaseSongAdapter.SongViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.spotifyclone.data.entities.Song> diffCallback = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.spotifyclone.data.entities.Song, kotlin.Unit> onItemClickListener;
    private final int layoutId = 0;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.spotifyclone.data.entities.Song> getDiffCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.recyclerview.widget.AsyncListDiffer<com.example.spotifyclone.data.entities.Song> getDiffer();
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.spotifyclone.data.entities.Song> getSongs() {
        return null;
    }
    
    public final void setSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.spotifyclone.data.entities.Song> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.plcoding.spotifycloneyt.adapters.BaseSongAdapter.SongViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlin.jvm.functions.Function1<com.example.spotifyclone.data.entities.Song, kotlin.Unit> getOnItemClickListener() {
        return null;
    }
    
    protected final void setOnItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.spotifyclone.data.entities.Song, kotlin.Unit> p0) {
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.spotifyclone.data.entities.Song, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BaseSongAdapter(int layoutId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/plcoding/spotifycloneyt/adapters/BaseSongAdapter$SongViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class SongViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public SongViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
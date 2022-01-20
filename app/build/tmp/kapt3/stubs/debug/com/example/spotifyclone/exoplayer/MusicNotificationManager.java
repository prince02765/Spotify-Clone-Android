package com.example.spotifyclone.exoplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/spotifyclone/exoplayer/MusicNotificationManager;", "", "context", "Landroid/content/Context;", "sessionToken", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "notificationListener", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;", "newSongCallback", "Lkotlin/Function0;", "", "(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;Lkotlin/jvm/functions/Function0;)V", "notificationManager", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;", "showNotification", "player", "Lcom/google/android/exoplayer2/Player;", "DescriptionAdapter", "app_debug"})
public final class MusicNotificationManager {
    private final com.google.android.exoplayer2.ui.PlayerNotificationManager notificationManager = null;
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> newSongCallback = null;
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player) {
    }
    
    public MusicNotificationManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaSessionCompat.Token sessionToken, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener notificationListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> newSongCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\u000fR\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/spotifyclone/exoplayer/MusicNotificationManager$DescriptionAdapter;", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$MediaDescriptionAdapter;", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "(Lcom/example/spotifyclone/exoplayer/MusicNotificationManager;Landroid/support/v4/media/session/MediaControllerCompat;)V", "createCurrentContentIntent", "Landroid/app/PendingIntent;", "player", "Lcom/google/android/exoplayer2/Player;", "getCurrentContentText", "", "getCurrentContentTitle", "getCurrentLargeIcon", "Landroid/graphics/Bitmap;", "callback", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager;", "app_debug"})
    final class DescriptionAdapter implements com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter {
        private final android.support.v4.media.session.MediaControllerCompat mediaController = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getCurrentContentTitle(@org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.app.PendingIntent createCurrentContentIntent(@org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.CharSequence getCurrentContentText(@org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.graphics.Bitmap getCurrentLargeIcon(@org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.Player player, @org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback callback) {
            return null;
        }
        
        public DescriptionAdapter(@org.jetbrains.annotations.NotNull()
        android.support.v4.media.session.MediaControllerCompat mediaController) {
            super();
        }
    }
}
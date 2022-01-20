package com.example.spotifyclone.exoplayer.callbacks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/spotifyclone/exoplayer/callbacks/MusicPlayerNotificationListener;", "Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$NotificationListener;", "musicService", "Lcom/example/spotifyclone/exoplayer/MusicService;", "(Lcom/example/spotifyclone/exoplayer/MusicService;)V", "onNotificationCancelled", "", "notificationId", "", "dismissedByUser", "", "onNotificationPosted", "notification", "Landroid/app/Notification;", "ongoing", "app_debug"})
public final class MusicPlayerNotificationListener implements com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener {
    private final com.example.spotifyclone.exoplayer.MusicService musicService = null;
    
    @java.lang.Override()
    public void onNotificationCancelled(int notificationId, boolean dismissedByUser) {
    }
    
    @java.lang.Override()
    public void onNotificationPosted(int notificationId, @org.jetbrains.annotations.NotNull()
    android.app.Notification notification, boolean ongoing) {
    }
    
    public MusicPlayerNotificationListener(@org.jetbrains.annotations.NotNull()
    com.example.spotifyclone.exoplayer.MusicService musicService) {
        super();
    }
}
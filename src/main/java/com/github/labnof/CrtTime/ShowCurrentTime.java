package com.github.labnof.CrtTime;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowCurrentTime extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        showNotification(e,getCurrentTime() );
    }

    public static Date getCurrentDate(){
        return new Date();
    }
    public static String getCurrentTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time = formatter.format(getCurrentDate());
        return time;
    }


    public static void showNotification(AnActionEvent e, String data) {
        NotificationGroup STICKY_GROUP = new NotificationGroup("demo.notifications.balloon",
                NotificationDisplayType.STICKY_BALLOON, true);

        Notification msg = STICKY_GROUP.createNotification(
                "Current Time", "", data,
                NotificationType.INFORMATION);
        msg.notify(getEventProject(e));
    }
}
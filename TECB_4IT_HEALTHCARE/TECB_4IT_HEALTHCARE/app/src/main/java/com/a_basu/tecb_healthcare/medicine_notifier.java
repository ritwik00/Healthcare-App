package com.a_basu.tecb_healthcare;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import static com.a_basu.tecb_healthcare.App.CHANNEL_ID;

public class medicine_notifier extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        ////////////////////////////////////////////////////////////////////////////////////////////
        String medicine_name = intent.getStringExtra("medicine_name");
        String reminder_text = "Take a " + medicine_name;
        ////////////////////////////////////////////////////////////////////////////////////////////
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("Medicine Reminder")
                .setContentText(reminder_text)
                .setPriority(NotificationCompat.PRIORITY_HIGH);
        ////////////////////////////////////////////////////////////////////////////////////////////
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(1, builder.build());
    }
}

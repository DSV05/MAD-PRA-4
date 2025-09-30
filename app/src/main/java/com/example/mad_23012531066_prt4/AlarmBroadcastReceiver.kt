package com.example.mad_23012531066_prt4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val str1 = intent.getStringExtra("service1")
        if (str1 == "start" || str1 == "stop") {
            val intentService = Intent(context, Alarmservice::class.java)
            if (str1 == "start")
                context.startService(intentService)
            else if (str1 == "stop")
                context.stopService(intentService)
        }
    }
}
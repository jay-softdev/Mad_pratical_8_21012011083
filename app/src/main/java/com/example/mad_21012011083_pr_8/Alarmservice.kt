package com.example.mad_21012011083_pr_8

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class Alarmservice : Service() {
    lateinit var Player: MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("guni")

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent!=null)
        {
            Player=MediaPlayer.create(this,R.raw.alarm)
            Player.start()
        }


        return START_STICKY

    }

    override fun onDestroy() {
        Player.stop()
        super.onDestroy()
    }
}

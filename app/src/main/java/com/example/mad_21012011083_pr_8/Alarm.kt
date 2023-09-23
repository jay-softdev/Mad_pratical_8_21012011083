package com.example.mad_21012011083_pr_8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Alarm : BroadcastReceiver() {

    companion object{
        val Alarmkey="Guni"
        val AlarmStart="Start"
        val AlarmStop="Stop"
    }






    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if (intent!=null)
        {
            val  data = intent.getStringExtra(Alarmkey)
            if(data!=null)
            {
                val intentService=Intent(context,Alarm::class.java)

                if(data== AlarmStart)
                {
                    context.startService(intentService)
                }
                else {
                    context.stopService(intentService)
                }
                }
            }
        }

}
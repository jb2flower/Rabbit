package com.cookandroid.kotlinapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BootCompleteReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when{
            intent?.action==Intent.ACTION_BOOT_COMPLETED->{
                Log.d("삐용삐용","부팅 완료^^*")
                Toast.makeText(context,"삐용삐용 : 부팅완료",Toast.LENGTH_LONG).show()
            }
        }
    }
}
package com.cookandroid.kotlinapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class ScreenOffReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when{
            intent?.action==Intent.ACTION_SCREEN_OFF->{
                Log.d("삐용삐용","삐용삐용 : 화면이 꺼졌습니다")
                Toast.makeText(context,"삐용삐용 : 화면이 꺼졌습니다", Toast.LENGTH_LONG).show()
            }
        }
    }
}
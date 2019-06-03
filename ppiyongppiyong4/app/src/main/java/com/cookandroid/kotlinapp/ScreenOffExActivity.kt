package com.cookandroid.kotlinapp

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class ScreenOffExActivity : AppCompatActivity() {
    //ScreenOffReceiver 객체
    var screenOffReceiver: ScreenOffReceiver?=null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.id_find)
        if (screenOffReceiver==null){
            screenOffReceiver=ScreenOffReceiver()
            val intentFilter=IntentFilter(Intent.ACTION_SCREEN_OFF)
            registerReceiver(screenOffReceiver,intentFilter)
        }
    }
}
package com.cookandroid.kotlinapp

import android.app.Service
import android.content.Intent
import android.os.IBinder

class LockScreen : Service() {
    //화면이 꺼질때 브로드캐스트 메세지를 수신하는 리서버
    var receiver: ScreenOffReceiver? =null
    override fun onBind(intent: Intent): IBinder {
        super.onCreate();
    }
}

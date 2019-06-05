package com.cookandroid.kotlinapp

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceFragment
import android.preference.SwitchPreference
import android.util.Log
import kotlinx.android.synthetic.main.main.*

class Main : Common() {
    val fragment=MyPreferenceFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        //fragmentManager.beginTransaction().replace(R.id.preferenceContent,fragment).commit()
    }
    class MyPreferenceFragment:PreferenceFragment(){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                activity.startForegroundService(Intent(activity, LockScreenService::class.java))
            } else {
                activity.startService(Intent(activity, LockScreenService::class.java))
            }
        }
    }
}

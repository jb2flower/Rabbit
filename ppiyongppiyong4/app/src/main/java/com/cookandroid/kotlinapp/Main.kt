package com.cookandroid.kotlinapp

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceFragment
import android.preference.SwitchPreference
import kotlinx.android.synthetic.main.main.*

class Main : Common() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}

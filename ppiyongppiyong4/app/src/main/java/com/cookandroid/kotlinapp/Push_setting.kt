package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.pw_find.*

class Push_setting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.push_setting)

        imgleftarrow.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }

    }
}

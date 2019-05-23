package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.push_setting.*

class Notification_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notification_list)

        imgleftarrow.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
    }
}

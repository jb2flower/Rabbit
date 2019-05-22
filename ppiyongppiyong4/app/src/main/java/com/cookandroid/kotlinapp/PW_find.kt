package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.pw_find.*

class PW_find : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pw_find)

        button11.setOnClickListener {
            val intent = Intent(this,ID_find::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this, PW_change::class.java)
            startActivity(intent)
        }

        imgleftarrow.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}

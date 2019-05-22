package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.setting.*

class Setting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting)

        imageButton1.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
        }

        imgbtn_user_re.setOnClickListener {
            val intent = Intent(this, Identification::class.java)
            startActivity(intent)
        }

        imageButton4.setOnClickListener {
            val intent = Intent(this, Push_setting::class.java)
            startActivity(intent)
        }

        imageButton6.setOnClickListener {
            val intent = Intent(this, Notification_list::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}

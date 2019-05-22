package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.join1.*
import kotlinx.android.synthetic.main.login.*

class Join1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join1)

        header_back_btn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        join_next_btn.setOnClickListener {
            val intent = Intent(this, Join2::class.java)
            startActivity(intent)
        }
    }
}

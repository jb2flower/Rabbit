package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.join1.*
import kotlinx.android.synthetic.main.join1.header_back_btn
import kotlinx.android.synthetic.main.join2.*

class Join2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join2)

        header_back_btn.setOnClickListener {
            val intent = Intent(this, Join1::class.java)
            startActivity(intent)
        }

        join_btn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}

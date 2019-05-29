package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*
import kotlinx.android.synthetic.main.join1.*

class Join1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join1)
        btnHeaderBack.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        btnSubmit.setOnClickListener {
            val intent = Intent(this, JoinOk::class.java)
            startActivity(intent)
        }
    }
}

package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*
import kotlinx.android.synthetic.main.id_find.*
import kotlinx.android.synthetic.main.join1.*

class ID_find : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.id_find)

        btnHeaderBack.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btnPwFind.setOnClickListener {
            val intent = Intent(this, PW_find::class.java)
            startActivity(intent)
        }

    }
}


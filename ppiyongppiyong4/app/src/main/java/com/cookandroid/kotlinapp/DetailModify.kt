package com.cookandroid.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.header.*
import kotlinx.android.synthetic.main.member_modify.*

class DetailModify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_modify)
        btnHeaderBack.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
        btnSubmit.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
    }
}

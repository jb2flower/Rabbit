package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*
import kotlinx.android.synthetic.main.identification.*
import kotlinx.android.synthetic.main.setting.*

class Identification : Common() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.identification)
        txtHeaderTitle.text="본인확인";
        btnHeaderBack.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
        btnSubmit.setOnClickListener {
            val intent = Intent(this, MemberModify::class.java)
            startActivity(intent)
        }
    }
}

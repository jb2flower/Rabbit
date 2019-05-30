package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*
import kotlinx.android.synthetic.main.pw_find.*

class PW_find : Common() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pw_find)
        txtHeaderTitle.text="아이디/비밀번호 찾기";
        btnIdFind.setOnClickListener {
            val intent = Intent(this,ID_find::class.java)
            startActivity(intent)
        }

        btnPwFind.setOnClickListener {
            val intent = Intent(this, PW_change::class.java)
            startActivity(intent)
        }
    }
}

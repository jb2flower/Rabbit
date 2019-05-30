package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*
import kotlinx.android.synthetic.main.member_modify.*

class MemberModify : Common() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.member_modify)
        txtHeaderTitle.text="기본정보 수정";
        btnHeaderBack.setOnClickListener {
            val intent = Intent(this, Join::class.java)
            startActivity(intent)
        }

        btnSubmit.setOnClickListener {
            val intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }
    }
}

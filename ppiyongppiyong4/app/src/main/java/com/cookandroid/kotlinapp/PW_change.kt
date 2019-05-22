package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.join1.*
import kotlinx.android.synthetic.main.pw_change.*

class PW_change : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pw_change)

        imgLeftArrowPink3.setOnClickListener {
            val intent = Intent(this, PW_find::class.java)
            startActivity(intent)
        }

    }
}

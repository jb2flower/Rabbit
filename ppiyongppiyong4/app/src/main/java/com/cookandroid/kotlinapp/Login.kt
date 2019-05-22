package com.cookandroid.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btnLogin.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
        }

        btnFind.setOnClickListener {
            val intent = Intent(this, ID_find::class.java)
            startActivity(intent)
        }

        btnJoin.setOnClickListener {
            val intent = Intent(this, Join1::class.java)
            startActivity(intent)
        }
    }
}

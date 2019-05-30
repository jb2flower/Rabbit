package com.cookandroid.kotlinapp
import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View

@SuppressLint("Registered")
open class Common: AppCompatActivity() {
    fun back(@Suppress("UNUSED_PARAMETER")v: View) {
        finish()
    }
    fun goSetting(@Suppress("UNUSED_PARAMETER")v: View) {
        val intent = Intent(this, Setting::class.java)
        startActivity(intent)
    }
}
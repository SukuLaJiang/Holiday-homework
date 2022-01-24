package com.example.holidayhomework.ui.activty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.holidayhomework.R

class WelComeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        var start_button = findViewById<Button>(R.id.start_button)

        //点击跳转到登录
        start_button.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }
}
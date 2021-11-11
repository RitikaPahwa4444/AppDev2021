package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
* Sign up as a nanny
* */
class NannySignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nanny_sign_up)
        val signup: Button = findViewById(R.id.nanny_signup)
        signup.setOnClickListener {
            val intent = Intent(this, CreateProfileNanny::class.java)
            startActivity(intent)
        }
        val n_login: TextView = findViewById(R.id.n_login)
        n_login.setOnClickListener {
            val intent = Intent(this, NannyLogin::class.java)
            startActivity(intent)
        }
    }
}
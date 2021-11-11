package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
* Sign up as a parent
*/
class ParentSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_sign_up)
        val signup: Button = findViewById(R.id.signup_btn_p)
        signup.setOnClickListener {
            val intent = Intent(this, CreateProfileParent::class.java)
            startActivity(intent)
        }
        val p_login: TextView = findViewById(R.id.p_login)
        p_login.setOnClickListener {
            val intent = Intent(this, ParentLogin::class.java)
            startActivity(intent)
        }
    }
}
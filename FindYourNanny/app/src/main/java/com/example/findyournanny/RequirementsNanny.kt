package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
/*
Set requirements as a nanny
*/
class RequirementsNanny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requirements_nanny)
        val signup: Button = findViewById(R.id.post)
        signup.setOnClickListener {
            setContentView(R.layout.job_posted_successfully)
            val dash: Button = findViewById(R.id.dashboard)
            dash.setOnClickListener {
                val intent = Intent(this, DashBoard::class.java)
                startActivity(intent)
            }
        }
    }
}
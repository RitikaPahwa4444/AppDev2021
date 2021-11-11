package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
* Set requirements as a parent
*/
class RequirementsParent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requirements_parent)
        val signup: Button = findViewById(R.id.find)
        signup.setOnClickListener {
            setContentView(R.layout.activity_matching_nannies)
            val match1: TextView = findViewById(R.id.match1)
            match1.setOnClickListener {
                val intent = Intent(this, NannyBooking::class.java)
                startActivity(intent)
            }
            val match2: TextView = findViewById(R.id.match2)
            match2.setOnClickListener {
                val intent = Intent(this, NannyBooking::class.java)
                startActivity(intent)
            }
        }
    }
}
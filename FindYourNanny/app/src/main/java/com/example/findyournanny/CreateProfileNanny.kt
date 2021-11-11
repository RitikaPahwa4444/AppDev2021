package com.example.findyournanny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

/*
*This activity creates a new profile after signing up as a nanny
*/
class CreateProfileNanny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_profile_nanny)
        val profile: Button = findViewById(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this, DashBoard::class.java)
            startActivity(intent)
        }
        val change: Button = findViewById(R.id.n_image)
        change.setOnClickListener {
            Toast.makeText(this, "Under Development", Toast.LENGTH_LONG).show()
        }
    }
}
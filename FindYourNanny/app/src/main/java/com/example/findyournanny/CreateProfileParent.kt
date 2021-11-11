package com.example.findyournanny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

/*
*This activity creates a new profile after signing up as a parent
*/
class CreateProfileParent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_profile)
        val profile: Button = findViewById(R.id.profile2)
        profile.setOnClickListener {
            val intent = Intent(this, ParentDashboard::class.java)
            startActivity(intent)
        }
        val change: Button = findViewById(R.id.image)
        change.setOnClickListener {
            Toast.makeText(this, "Under Development", Toast.LENGTH_LONG).show()
        }
    }
}
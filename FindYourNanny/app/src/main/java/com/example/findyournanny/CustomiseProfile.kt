package com.example.findyournanny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

/*
*This activity updates the profile of nanny
*/
class CustomiseProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customise_profile)
        val update: Button = findViewById(R.id.updateProfile)
        update.setOnClickListener {
            Toast.makeText(this, "Profile Updated", Toast.LENGTH_LONG).show()
            val intent = Intent(this, DashBoard::class.java)
            startActivity(intent)
        }
        val changeImg: Button = findViewById(R.id.change_image)
        changeImg.setOnClickListener {
            Toast.makeText(this, "Under Development", Toast.LENGTH_LONG).show()
        }
    }
}
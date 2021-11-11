package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/*
*This activity updates the profile of the parent
*/
class CustomiseProfileParent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customise_profile_parent)
        val update: Button = findViewById(R.id.updateProfileParent)
        update.setOnClickListener {
            Toast.makeText(this, "Profile Updated", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ParentDashboard::class.java)
            startActivity(intent)
        }
        val changeImg: Button = findViewById(R.id.choose_image)
        changeImg.setOnClickListener {
            Toast.makeText(this, "Under Development", Toast.LENGTH_LONG).show()
        }
    }
}
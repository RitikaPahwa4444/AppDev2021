package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
/*
*This activity lists the job offers available for the nanny
*/
class JobOffer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_offer)
        val chat: Button = findViewById(R.id.chat2)
        chat.setOnClickListener {
            val intent = Intent(this, LiveChat2::class.java)
            startActivity(intent)
        }
        val book: Button = findViewById(R.id.accept)
        book.setOnClickListener {
            setContentView(R.layout.accepted)
            val dashBtn: Button = findViewById(R.id.dash2)
            dashBtn.setOnClickListener {
                val intent = Intent(this, DashBoard::class.java)
                startActivity(intent)
            }
        }
    }
}
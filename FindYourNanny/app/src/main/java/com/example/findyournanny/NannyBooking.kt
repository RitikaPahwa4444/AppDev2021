package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/*
*Booking Page
*/
class NannyBooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matching_nanny2)
        val chat: Button = findViewById(R.id.chat)
        chat.setOnClickListener {
            val intent = Intent(this, LiveChat::class.java)
            startActivity(intent)
        }
        val book: Button = findViewById(R.id.book)
        book.setOnClickListener {
            setContentView(R.layout.booking_successful)
            val dashBtn: Button = findViewById(R.id.dash)
            dashBtn.setOnClickListener {
                val intent = Intent(this, ParentDashboard::class.java)
                startActivity(intent)
            }
        }
    }
}
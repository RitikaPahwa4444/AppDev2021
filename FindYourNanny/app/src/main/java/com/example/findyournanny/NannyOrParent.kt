package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/*
* Is the user of the app a nanny or a parent?
 */
class NannyOrParent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nanny_or_parent)
        val nanny: Button = findViewById(R.id.Nanny)
        nanny.setOnClickListener {
            val intent = Intent(this, NannyLogin::class.java)
            startActivity(intent)
        }
        val parent: Button = findViewById(R.id.Parent)
        parent.setOnClickListener {
            val intent = Intent(this, ParentLogin::class.java)
            startActivity(intent)
        }
    }
}
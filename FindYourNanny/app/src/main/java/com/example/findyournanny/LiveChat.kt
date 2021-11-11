package com.example.findyournanny

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.findyournanny.databinding.ActivityLiveChatBinding

/*
*Live Chat with the nanny (option available for the parent)
*/
class LiveChat : AppCompatActivity() {
    private var binding:ActivityLiveChatBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLiveChatBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.toolbarExercise)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarExercise?.setNavigationOnClickListener {
            onBackPressed()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
package com.example.findyournanny

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.findyournanny.databinding.ActivityLiveChat2Binding

/*
*Live Chat with the parent (option available for the nanny)
*/
class LiveChat2 : AppCompatActivity() {
    private var binding: ActivityLiveChat2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLiveChat2Binding.inflate(layoutInflater)
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
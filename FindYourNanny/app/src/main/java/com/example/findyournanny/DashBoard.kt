package com.example.findyournanny

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
/*
*Dashboard for the nanny
*/
class DashBoard : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        val requirements: Button = findViewById(R.id.requirements)
        requirements.setOnClickListener {
            val intent = Intent(this, RequirementsNanny::class.java)
            startActivity(intent)
        }
        val offers: Button = findViewById(R.id.offers)
        offers.setOnClickListener {
            setContentView(R.layout.activity_matching_parents)
            val match1n: TextView = findViewById(R.id.match1n)
            match1n.setOnClickListener {
                val intent = Intent(this, JobOffer::class.java)
                startActivity(intent)
            }
        }
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawer: DrawerLayout = findViewById(R.id.drawer_layer)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.bringToFront()
        toggle = ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.Profile -> {
                    val intent = Intent(this, CustomiseProfile::class.java)
                    startActivity(intent)
                }

                else -> Toast.makeText(this, "Under Development", Toast.LENGTH_LONG).show()
            }
            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
            return true
        return super.onOptionsItemSelected(item)
    }
}
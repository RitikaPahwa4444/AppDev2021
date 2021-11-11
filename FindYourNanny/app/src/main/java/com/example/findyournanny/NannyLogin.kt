package com.example.findyournanny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
/*
*Login as a nanny
* Default Username: Nanny
* Default Password: isoc@2021
*/
class NannyLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nanny_login)
        val login:Button=findViewById(R.id.nanny_login)
        login.setOnClickListener {
            val user:EditText=findViewById(R.id.NUsername)
            val pass:EditText=findViewById(R.id.NPassword)
            if(user.text.toString() == "Nanny" && pass.text.toString() == "isoc@2021"){
                val intent= Intent(this, DashBoard::class.java )
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Incorrect username/password",Toast.LENGTH_LONG).show()
        }
        val n_signup:TextView=findViewById(R.id.n_signup)
        n_signup.setOnClickListener{
            val intent= Intent(this, NannySignUp::class.java )
            startActivity(intent)
        }
    }
}
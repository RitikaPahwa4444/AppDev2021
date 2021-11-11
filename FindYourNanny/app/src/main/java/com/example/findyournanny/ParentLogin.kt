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
* Default Username: Parent
* Default Password: isoc@2021
*/
class ParentLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_login)
        val login:Button=findViewById(R.id.parent_login)
        login.setOnClickListener {
            val user: EditText =findViewById(R.id.PUsername)
            val pass: EditText =findViewById(R.id.PPassword)
            if(user.text.toString()=="Parent"&&pass.text.toString()=="isoc@2021"){
                val intent= Intent(this, ParentDashboard::class.java )
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_LONG).show()
        }
        val p_signup:TextView=findViewById(R.id.p_signup)
        p_signup.setOnClickListener{
            val intent= Intent(this, ParentSignUp::class.java )
            startActivity(intent)
        }
    }
}
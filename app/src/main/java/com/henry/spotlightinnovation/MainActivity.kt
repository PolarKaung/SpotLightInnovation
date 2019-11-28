package com.henry.spotlightinnovation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbout.setOnClickListener {
            Log.i("about", "About is clicked!")

            intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            Log.i("signup", "SignUp is clicked!")

            intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            Log.i("login", "LogIn is clicked!")

        }
    }


}

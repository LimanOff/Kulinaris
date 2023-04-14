package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_panel)
    }

    fun OpenAuthActivity(view: View)
    {
        val intent = Intent(this,AuthorizationActivity::class.java)
        startActivity(intent)
    }

    fun OpenMenuActivity(view: View)
    {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}
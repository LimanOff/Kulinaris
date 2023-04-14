package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AuthorizationActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization_panel)
    }

    fun OpenRegActivity(view: View)
    {
        val intent = Intent(this,RegistrationActivity::class.java)
        startActivity(intent)
    }

    fun OpenMenuActivity(view: View)
    {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}
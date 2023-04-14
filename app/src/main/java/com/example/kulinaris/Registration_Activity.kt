package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registration_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_panel)
    }

    fun OpenAuthActivity(view: View)
    {
        val intent = Intent(this,Authorization_Activity::class.java)
        startActivity(intent)
    }

    fun OpenMenuActivity(view: View)
    {
        val intent = Intent(this,Menu_Activity::class.java)
        startActivity(intent)
    }
}
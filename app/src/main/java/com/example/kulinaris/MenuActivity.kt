package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun OpenFavoriteRecipesActivity(view: View)
    {
        intent = Intent(this,FavoritesRecipesActivity::class.java)
        startActivity(intent)
    }

    fun OpenAddingIngredientsActivity(view: View)
    {
        intent = Intent(this,AddingIngredientsActivity::class.java)
        startActivity(intent)
    }
}
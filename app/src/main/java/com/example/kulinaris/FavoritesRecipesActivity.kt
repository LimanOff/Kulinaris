package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FavoritesRecipesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites_recipes)
    }

    fun OpenAddingIngredientsActivity(view: View)
    {
        intent = Intent(this,AddingIngredientsActivity::class.java)
        startActivity(intent)
    }
}
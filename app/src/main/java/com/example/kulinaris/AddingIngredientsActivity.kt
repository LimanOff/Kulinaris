package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.core.content.ContentProviderCompat.requireContext

class AddingIngredientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adding_ingredients)

        val ingredientsTextView = resources.getStringArray(R.array.ingredients)
        val arrayAdapter = ArrayAdapter(this,R.layout.dropdown_item,ingredientsTextView)

        val ingredientTextView : AutoCompleteTextView = findViewById(R.id.IngredientTextView)
        val quantityTextView : AutoCompleteTextView = findViewById(R.id.QuantityTextView)

        ingredientTextView.setAdapter(arrayAdapter)
    }

    fun OpenFavoriteRecipesActivity(view: View)
    {
        intent = Intent(this, FavoritesRecipesActivity::class.java)
        startActivity(intent)
    }

    fun DeleteText(view: View) {}
}
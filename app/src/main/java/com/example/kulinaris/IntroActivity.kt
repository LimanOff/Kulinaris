package com.example.kulinaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val title : TextView = findViewById(R.id.title)

        val radial : ImageView = findViewById(R.id.radial_background)
        val cap : ImageView = findViewById(R.id.cap)
        val head : ImageView = findViewById(R.id.head)
        val face : ImageView = findViewById(R.id.face)

        val appearAnimation : Animation = AnimationUtils.loadAnimation(this,R.anim.appear_animation)
        val dropAnimation : Animation = AnimationUtils.loadAnimation(this,R.anim.drop_animation)
        val titleAnimation : Animation = AnimationUtils.loadAnimation(this,R.anim.text_animation)
        val sizeChangedAnimation : Animation = AnimationUtils.loadAnimation(this,R.anim.size_change_animation)

        title.startAnimation(titleAnimation)

        radial.startAnimation(appearAnimation)
        cap.startAnimation(appearAnimation)
        head.startAnimation(appearAnimation)
        face.startAnimation(appearAnimation)

        radial.startAnimation(dropAnimation)
        cap.startAnimation(dropAnimation)
        head.startAnimation(dropAnimation)
        face.startAnimation(dropAnimation)

        radial.startAnimation(sizeChangedAnimation)

        val timer = object: CountDownTimer(2300, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                LoadNextActivity()
            }
        }
        timer.start()


    }
    fun LoadNextActivity()
    {
        val intent = Intent(this,RegistrationActivity::class.java)
        startActivity(intent)
    }
}
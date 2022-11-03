package com.example.frecx.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.frecx.MainActivity
import com.example.frecx.R
import kotlinx.android.synthetic.main.fragment_splash.*


class SplashFragment : AppCompatActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.fragment_splash)
        findViewById(R.id.icon).setImageRessource(R.drawable.splash_icon)

        val homeIntent = Intent(this@SplashFragment, MainActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(homeIntent)
            finish()
        }, SPLASH_TIME_OUT.toLong()) }
    companion object {
        const val SPLASH_TIME_OUT = 3000
    }

}





package com.getir.patika.foodcouriers.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.getir.patika.foodcouriers.MainActivity
import com.getir.patika.foodcouriers.R
import com.getir.patika.foodcouriers.presentation.onboarding.OnboardingActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    private var userId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        CoroutineScope(Dispatchers.Main).launch {
            delay(SPLASH_TIME)

            userId?.let {
                startActivity(MainActivity.callIntent(this@SplashActivity))
            } ?: run {
                startActivity(OnboardingActivity.callIntent(this@SplashActivity))
            }

        }
    }


    companion object {
        private const val SPLASH_TIME = 4000L
    }


}
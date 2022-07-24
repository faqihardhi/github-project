package id.ac.polbeng.githubproject.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import id.ac.polbeng.githubproject.databinding.ActivitySplashScreenActivityBinding
import id.ac.polbeng.githubproject.helpers.Config

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(mainLooper).postDelayed({
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }, Config.SPLASH_SCREEN_DELAY)
    }
}
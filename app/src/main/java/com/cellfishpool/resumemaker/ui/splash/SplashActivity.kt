package com.cellfishpool.resumemaker.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cellfishpool.resumemaker.ui.showcase.ShowcaseActivity
/*
* Authentication Handle(Including shared preferances)
* */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var i = Intent(this,ShowcaseActivity::class.java)
        startActivity(i)
        finish()
    }
}
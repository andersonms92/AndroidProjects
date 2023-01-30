package com.myapps.androidprojects

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myapps.androidprojects.ContextUtils.ContextUtils.startDeepLink

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
        startDeepLink(this, InternalPath.LOGIN)
        finish()
    }
}
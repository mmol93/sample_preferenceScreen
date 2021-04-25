package com.example.sample_preferencesscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sample_preferencesscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binder : ActivityMainBinding
    val settingFragment = fragmentSetting()
    val resultFragment = fragmentResult()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binder = ActivityMainBinding.inflate(layoutInflater)

        binder.button.setOnClickListener {
            val tran = supportFragmentManager.beginTransaction()
            tran.replace(R.id.container1, settingFragment)
            tran.commit()
        }

        binder.button2.setOnClickListener {
            val tran = supportFragmentManager.beginTransaction()
            tran.replace(R.id.container1, resultFragment)
            tran.commit()
        }

        setContentView(binder.root)
    }
}
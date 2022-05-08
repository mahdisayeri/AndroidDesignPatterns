package com.tokastudio.androiddesignpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.tokastudio.androiddesignpatterns.builder.Hamburger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hamburger= Hamburger.Builder()
            .ham(true)
            .cheese(false)
            .tomatoes(true)
            .build()
        hamburger.printData()
    }
}
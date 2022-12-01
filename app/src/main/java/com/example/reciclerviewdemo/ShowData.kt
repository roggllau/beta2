package com.example.reciclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ShowData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)
        val imageboto = findViewById<android.widget.ImageButton>(R.id.imageButton)
        //when image button is clicked, go back to main activity
        imageboto.setOnClickListener {
            finish()
        }
    }
}
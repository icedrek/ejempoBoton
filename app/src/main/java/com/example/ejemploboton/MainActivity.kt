package com.example.ejemploboton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newText: String = this.getString(R.string.greeting2)
        findViewById<Button>(R.id.button)
            .setOnClickListener {
                findViewById<TextView>(R.id.textView).text = newText
            }
    }
}
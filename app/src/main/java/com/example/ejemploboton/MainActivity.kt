package com.example.ejemploboton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejemploboton.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val greeting1 = this.getString(R.string.greeting)
        val greeting2 = this.getString(R.string.greeting2)

        binding.button.setOnClickListener {
            binding.textView.text = if (binding.textView.text == greeting1) greeting2 else greeting1
        }
    }
}
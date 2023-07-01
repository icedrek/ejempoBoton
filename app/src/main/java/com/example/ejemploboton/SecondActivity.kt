package com.example.ejemploboton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.ejemploboton.FirstFragment.Companion.TEXT_OF_FRAGMENT
import com.example.ejemploboton.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = bundleOf(TEXT_OF_FRAGMENT to "FRAGMENTO DE LOGIN")

        val newFragment = SecondFragment()
        val transaction = supportFragmentManager.beginTransaction()

        supportFragmentManager.commit {
            setReorderingAllowed(true)

            add<LoginFragment>(binding.fragmentContainer.id, args = bundle)
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.button3.setOnClickListener {
            transaction.replace(binding.fragmentContainer.id, newFragment)
            transaction.addToBackStack(null)
            transaction.commit()


        }
    }
}

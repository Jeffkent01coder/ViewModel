package com.jeff.viewmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.jeff.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        myViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        binding.textViewCounter.text = myViewModel.getInitialCounter().toString()

        binding.buttonCount.setOnClickListener {
            binding.textViewCounter.text = myViewModel.getUpdatedCounter().toString()
        }

        binding.buttonCountMinus.setOnClickListener {
            binding.textViewCounter.text = myViewModel.getSubtractCounter().toString()
        }

    }
}
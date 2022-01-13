package com.example.catzap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catzap.adapter.CatAdapter
import com.example.catzap.adapter.CatAdapterChat
import com.example.catzap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setup view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerStory.adapter = CatAdapter(applicationContext)

        binding.recyclerChat.adapter = CatAdapterChat(applicationContext)

    }
}
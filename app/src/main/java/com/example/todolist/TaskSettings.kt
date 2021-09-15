package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist.databinding.ActivityTaskSettingsBinding

class TaskSettings : AppCompatActivity() {
    private lateinit var binding: ActivityTaskSettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskSettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bBack = binding.ivBack
        bBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
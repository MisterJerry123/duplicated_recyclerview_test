package com.example.duplicated_recyclerview_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.duplicated_recyclerview_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recycerveiw01.apply {
            adapter = ListAdapter01()
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)


        }



    }




}
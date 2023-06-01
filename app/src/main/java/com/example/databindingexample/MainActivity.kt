package com.example.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModelFactory = MainViewModelFactory(Student(id= 1, name= "Jhon", email= "jhon@email.com"))
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]

        initializeObservers()
    }

    private fun initializeObservers(){

        viewModel.helloText().observe(this){
            binding.textWelcome.text = it
        }

        viewModel.student().observe(this){
            binding.student = it
        }
    }

}

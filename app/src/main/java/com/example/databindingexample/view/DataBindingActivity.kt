package com.example.databindingexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityDataBindingBinding
import com.example.databindingexample.model.Student
import com.example.databindingexample.viewmodel.DataBindingViewModel
import com.example.databindingexample.viewmodel.DataBindingViewModelFactory

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding
    private lateinit var viewModel: DataBindingViewModel
    private lateinit var viewModelFactory: DataBindingViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        viewModelFactory = DataBindingViewModelFactory(Student(id= 1, name= "Jhon", email= "jhon@email.com"))
        viewModel = ViewModelProvider(this, viewModelFactory)[DataBindingViewModel::class.java]

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
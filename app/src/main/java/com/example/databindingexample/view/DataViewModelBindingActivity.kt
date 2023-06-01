package com.example.databindingexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityDataViewModelBindingBinding
import com.example.databindingexample.viewmodel.DataViewModelBindingViewModel

class DataViewModelBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataViewModelBindingBinding
    private lateinit var viewModel: DataViewModelBindingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_view_model_binding)
        viewModel = ViewModelProvider(this).get(DataViewModelBindingViewModel::class.java)

        initializeObservers()

    }

    private fun initializeObservers(){
        viewModel.getTitle().observe(this){
            binding.textTitle.text = it
        }
    }
}
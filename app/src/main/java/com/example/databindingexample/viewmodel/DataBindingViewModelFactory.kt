package com.example.databindingexample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.model.Student

class DataBindingViewModelFactory(private val student: Student): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DataBindingViewModel::class.java)){
            return DataBindingViewModel(student) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}
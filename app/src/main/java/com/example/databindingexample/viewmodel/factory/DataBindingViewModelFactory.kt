package com.example.databindingexample.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.model.Student
import com.example.databindingexample.viewmodel.DataBindingViewModel

class DataBindingViewModelFactory(private val student: Student): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DataBindingViewModel::class.java)){
            return DataBindingViewModel(student) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}
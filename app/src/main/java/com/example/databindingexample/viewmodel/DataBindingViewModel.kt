package com.example.databindingexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databindingexample.model.Student

class DataBindingViewModel(studentInit: Student): ViewModel() {

    private var helloText = MutableLiveData<String>()
    private var student = MutableLiveData<Student>()

    init{
        helloText.value = "DataBinding Example"
        student.value = studentInit
    }

    fun helloText(): LiveData<String>{
        return helloText
    }

    fun student(): LiveData<Student>{
        return student
    }

}
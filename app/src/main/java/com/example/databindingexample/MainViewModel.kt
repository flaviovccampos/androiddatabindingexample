package com.example.databindingexample

import android.util.MutableDouble
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var helloText = MutableLiveData<String>()
    private var student = MutableLiveData<Student>()

    init{
        helloText.value = "DataBinding Example"
        student.value = Student(1, "Jhon", "jhon@email.com")
    }

    fun helloText(): LiveData<String>{
        return helloText
    }

    fun student(): LiveData<Student>{
        return student
    }

}
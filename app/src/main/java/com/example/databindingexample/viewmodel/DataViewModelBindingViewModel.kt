package com.example.databindingexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databindingexample.model.Student

class DataViewModelBindingViewModel: ViewModel() {

    private var title =  MutableLiveData<String>()
    private var student = MutableLiveData<Student>()

    val studentData: LiveData<Student>
        get() {
            return student
        }

    init {
        title.value = "Data ViewModel Binding"
        //student.value = null
    }

    fun getTitle(): LiveData<String>{
        return title
    }

    fun getStudent(): LiveData<Student>{
        return student
    }

    fun generateStudent(){
        student.value = Student(id= 2, name= "Scott", email= "scott@email.com")
    }

    fun clearStudent(){
        student.value = null
    }
}
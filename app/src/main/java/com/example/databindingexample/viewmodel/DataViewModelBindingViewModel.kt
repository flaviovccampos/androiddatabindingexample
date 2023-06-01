package com.example.databindingexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModelBindingViewModel: ViewModel() {

    private lateinit var title: MutableLiveData<String>

    init {
        title.value = "Data ViewModel Binding"
    }

    fun getTitle(): LiveData<String>{
        return title
    }
}
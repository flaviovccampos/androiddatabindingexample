package com.example.databindingexample

import android.util.MutableDouble
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var helloText = MutableLiveData<String>()

    init{
        helloText.value = "DataBinding Example"
    }

    fun helloText(): LiveData<String>{
        return helloText
    }

}
package com.example.databindingexample.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.viewmodel.DataBindingViewModel
import com.example.databindingexample.viewmodel.DataBindingViewModelFactory
import com.example.databindingexample.R
import com.example.databindingexample.model.Student
import com.example.databindingexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), OnClickListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDataBinding.setOnClickListener(this)
        binding.btnDataViewModelBinding.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_data_binding){
            val intent = Intent(this, DataBindingActivity::class.java)
            startActivity(intent)
        }
        if(v?.id == R.id.btn_data_view_model_binding){
            val intent = Intent(this, DataViewModelBindingActivity::class.java)
            startActivity(intent)
        }
    }

}

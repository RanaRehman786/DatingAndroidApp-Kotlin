package com.example.datingapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.datingapp.R
import com.example.datingapp.databinding.ActivityOnBoarding2Binding

class OnBoarding : AppCompatActivity() {
    lateinit var binding: ActivityOnBoarding2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_on_boarding2)
       binding.llContinuePhn.setOnClickListener(){
           intent= Intent(this,SignIn::class.java)
           startActivity(intent)
       }

    }
}
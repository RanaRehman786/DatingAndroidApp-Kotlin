package com.example.datingapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.datingapp.R
import com.example.datingapp.databinding.ActivityOtpBinding
import com.example.datingapp.databinding.ActivitySignInBinding

class Otp : AppCompatActivity() {
    lateinit var binding: ActivityOtpBinding
    var counter=30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_otp)
        val message = intent.getStringExtra("message_key")
        binding.tvShowNumber.text = message
        binding.ivBackArrow.setOnClickListener() {
            finish()
        }
        startTimeCounter()

            binding.tvResendOtp.setOnClickListener(){
                counter=30
                startTimeCounter()

            }
      binding.btnAccept.setOnClickListener(){
          val intent=Intent(this,SignUp::class.java)
          startActivity(intent)
      }
    }

    private fun startTimeCounter() {
        object : CountDownTimer(32000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.tvCounter.text = counter.toString()
                counter--
            }

            override fun onFinish() {

            }
        }.start()
    }


    }

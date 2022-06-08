package com.example.datingapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.datingapp.R
import com.example.datingapp.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {

    lateinit var binding:ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_sign_in)
    binding.btnContinue.setOnClickListener() {
        intent = Intent(this,Otp::class.java)
        val message =binding.etNumber.text.toString()

        intent.putExtra("message_key", "${binding.ccp.fullNumberWithPlus.toString()} $message")



        startActivity(intent)
        binding.ivBackArrow.setOnClickListener(){
            finish()
        }
    }




}
}
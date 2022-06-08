package com.example.datingapp.activities

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.core.graphics.drawable.DrawableCompat
import androidx.databinding.DataBindingUtil
import com.example.datingapp.R
import com.example.datingapp.databinding.ActivitySignUpBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        binding.etCelender.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener
                { view, year, monthOfYear, dayOfMonth ->
                    binding.etCelender.setText("" + dayOfMonth + " - " + (monthOfYear + 1) + " - " + year)
                    val c = Calendar.getInstance()
                    c.get(Calendar.HOUR_OF_DAY)
                    c.get(Calendar.MINUTE)
                }, year, month, day
            )
            datePickerDialog.show()
        }
        binding.llMale.setOnClickListener() {
            binding.tvMale.setTextColor(this.resources.getColor(R.color.pink))
            binding.tvFemale.setTextColor(this.resources.getColor(R.color.gray1))
            binding.llMale.background = this.resources.getDrawable(R.drawable.bg_pink_border)
            binding.llFemale.background = this.resources.getDrawable(R.drawable.black_border)
            binding.ivFemale.setColorFilter(
                binding.ivFemale.getContext().getResources().getColor(R.color.gray1),
                PorterDuff.Mode.SRC_ATOP
            );
            binding.ivMale.setColorFilter(
                binding.ivMale.getContext().getResources().getColor(R.color.pink),
                PorterDuff.Mode.SRC_ATOP
            );


        }
        binding.llFemale.setOnClickListener() {
            binding.tvFemale.setTextColor(this.resources.getColor(R.color.pink))
            binding.tvMale.setTextColor(this.resources.getColor(R.color.gray1))
            binding.llFemale.background = this.resources.getDrawable(R.drawable.bg_pink_border)
            binding.llMale.background = this.resources.getDrawable(R.drawable.black_border)
            binding.ivFemale.setColorFilter(
                binding.ivFemale.getContext().getResources().getColor(R.color.pink),
                PorterDuff.Mode.SRC_ATOP
            );
            binding.ivMale.setColorFilter(
                binding.ivMale.getContext().getResources().getColor(R.color.gray1),
                PorterDuff.Mode.SRC_ATOP
            );


        }
        binding.etLocation.setOnClickListener() {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
        binding.btnnContinue.setOnClickListener() {
            val intent = Intent(this, Profile::class.java)
            val message = binding.etName.text.toString()
            intent.putExtra("message_key", message)
            startActivity(intent)
        }

    }


}


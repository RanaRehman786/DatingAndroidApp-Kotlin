package com.example.datingapp

import androidx.fragment.app.Fragment
import androidx.navigation.NavController

interface Baselistner {
    fun fragmentChange(fragment: Fragment)
    fun callback()
    fun navigate(id:Int)
    fun showbottombar()
    fun hiddenbottombar()
}
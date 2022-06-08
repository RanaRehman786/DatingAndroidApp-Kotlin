package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.datingapp.databinding.ActivityMainBinding
import com.example.datingapp.fragments.AccountFragment
import com.example.datingapp.fragments.ChatFragment
import com.example.datingapp.fragments.HomeFragment
import com.example.datingapp.fragments.LikeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), Baselistner {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController = findNavController(R.id.fragment_container)
        binding.bottomnavview.setupWithNavController(navController)
//        replacefragment(HomeFragment())
//        binding.navHome.setOnClickListener(){
//            fragmentChange(HomeFragment())
//        }
//        binding.navChat.setOnClickListener(){
//            fragmentChange(ChatFragment())
//        }
//        binding.navLike.setOnClickListener(){
//            fragmentChange(LikeFragment())
//        }
//        binding.navAccount.setOnClickListener(){
//            fragmentChange(AccountFragment())
//        }
//    }
//    private fun replacefragment(frag: Fragment) {
//        val fragment = supportFragmentManager.beginTransaction()
//        fragment.replace(R.id.fragment_container, frag).addToBackStack(null).commit()
//    }
//
//    override fun fragmentChange(fragment: Fragment) {
//        replacefragment(fragment)
//    }
//
//    override fun callback() {
//        onBackPressed()
//    }
//    override fun onBackPressed() {
//
//        if (supportFragmentManager.backStackEntryCount >1) {
//            super.onBackPressed()
//            //additional code
//        } else {
//            finish()
//        }
//    }
    }

    override fun fragmentChange(fragment: Fragment) {

    }

    override fun callback() {
        onBackPressed()
    }

    override fun navigate(id: Int) {
        navController.navigate(id)
    }

    override fun showbottombar() {
        binding.bottomnavview.visibility = View.VISIBLE

    }

    override fun hiddenbottombar() {
        binding.bottomnavview.visibility = View.GONE
    }

    override fun onBackPressed() {

//        if (supportFragmentManager.backStackEntryCount > 1) {
        super.onBackPressed()
        //additional code
//        } else {
//            finish()
//        }
    }
}



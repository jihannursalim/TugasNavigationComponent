package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.bottomnav.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var btnNav: BottomNavigationView
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Menggunakan Navigation Component
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        setupWithNavController(bottomNavigationView, navController)


        //Tanpa Navigation Component
//        val fragmentManager = supportFragmentManager
//        fragmentManager.beginTransaction()
//            .replace(R.id.frame_layout, HomeFragment())
//            .commit()
//
//        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.home -> {
//                    fragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, HomeFragment())
//                        .commit()
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.profile -> {
//                    fragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, ProfileFragment())
//                        .commit()
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.settings -> {
//                    fragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, SettingsFragment())
//                        .commit()
//                    return@setOnNavigationItemSelectedListener true
//                }
//            }
//            false
//        }
    }
}
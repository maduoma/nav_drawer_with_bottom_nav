package com.dodemy.patientrecords.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.dodemy.patientrecords.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navController = findNavController(R.id.nav_host_fragment)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navView = findViewById<NavigationView>(R.id.nav_view)
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        appBarConfiguration = AppBarConfiguration.Builder(
            // Add top-level destinations of the DrawerLayout and BottomNavigationView
            R.id.drawer_destination1, R.id.drawer_destination2,R.id.drawer_destination3,
            R.id.bottom_destination1, R.id.bottom_destination2, R.id.bottom_destination3
        )
            .setOpenableLayout(drawerLayout)
            .build()

        // Setup the ActionBar with the NavController
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Connect the DrawerLayout and BottomNavigationView with the NavController
        navView.setupWithNavController(navController)
        bottomNavView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}
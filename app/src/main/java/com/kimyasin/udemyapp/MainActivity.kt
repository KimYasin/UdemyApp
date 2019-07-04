package com.kimyasin.udemyapp

import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*


class MainActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        displayScreen(-1)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)

        }

    }

    fun  displayScreen (id: Int){
        val fragment = when (id){


            R.id.nav_home -> {
               home ()
            }
            R.id.nav_development -> {
                Development ()
            }
            R.id.nav_business -> {
                Business ()
            }
            R.id.nav_finance_and_accounting -> {
                Finance_and_accounting()
            }
            R.id.nav_It_and_software -> {
                IT_and_software ()
            }
            R.id.nav_officeProductivity -> {
                officeProductivity ()
            }
            R.id.nav_personal_development -> {
                Personal_development ()
            }
            R.id.nav_Design -> {
                Design ()
            }
            R.id.nav_marketing -> {
                Marketing ()
            }
            R.id.nav_lifestyle -> {
                Lifestyle ()
            }
            R.id.nav_photography -> {
                Photography ()
            }
            R.id.nav_health_and_fitness -> {
                Health_and_fitness ()
            }
            R.id.nav_music -> {
                Music ()
            }
            R.id.nav_teaching_and_academics -> {
                Teaching_and_academics ()
            }
            else -> {
                home()
            }
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.relativelayout, fragment)
            .commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        displayScreen(item.itemId)
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}


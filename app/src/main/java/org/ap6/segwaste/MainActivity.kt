package org.ap6.segwaste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.ap6.segwaste.fragments.*

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottomNav)
        
        val homeFragment = HomeFragment()
        val wasteTrackerFragment = WasteTrackerFragment()
        val wastedFragment = WastEdFragment()
        val waysteFragment = WAYsteFragment()

        makeCurrentFragment(homeFragment)

        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_tracker -> makeCurrentFragment(wasteTrackerFragment)
                R.id.ic_wasted -> makeCurrentFragment(wastedFragment)
                R.id.ic_wayste -> makeCurrentFragment(waysteFragment)
            }
            true
        }
    }

    // Changes the fragment currently being shown
    private fun makeCurrentFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }

    // Opens the activity for the WasteID function
    public fun openWasteID(view: View){
        var intent = Intent(this, WasteIDActivity::class.java)
        startActivity(intent)
    }
}
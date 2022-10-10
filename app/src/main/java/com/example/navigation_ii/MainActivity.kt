package com.example.navigation_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * id del container: R.id.mainContainer
         * instancia del fragment: BlueFragment()
         */
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, BlueFragment()).commit()
    }
}
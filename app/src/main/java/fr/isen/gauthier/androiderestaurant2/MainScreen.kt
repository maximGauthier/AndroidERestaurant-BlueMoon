package fr.isen.gauthier.androiderestaurant2

import android.app.Activity
import android.os.Bundle

/**
 * Loads [MainFragment].
 */
class MainScreen : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }
}
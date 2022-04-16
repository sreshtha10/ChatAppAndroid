package com.sreshtha.chatappandroid.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseUser
import com.sreshtha.chatappandroid.R
import com.sreshtha.chatappandroid.databinding.ActivityHomeBinding
import com.sreshtha.chatappandroid.viewmodel.HomeViewModel
import com.sreshtha.chatappandroid.viewmodel.HomeViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem
import javax.inject.Inject


@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private lateinit var homeBinding: ActivityHomeBinding
    val viewModel : HomeViewModel by viewModels()
    //@Inject lateinit var currentUser:FirebaseUser

    companion object{
        const val TAG = "HOME_ACTIVITY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // Log.d(TAG,currentUser.email.toString())
        homeBinding = ActivityHomeBinding.inflate(layoutInflater)
        //val viewModelFactory =
           // HomeViewModelFactory(application, currentUser)
        //viewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)
        setTheme(R.style.Theme_ChatAppAndroid)
        setContentView(homeBinding.root)

        homeBinding.apply {
            val menuItems = arrayOf(
                CbnMenuItem(
                    R.drawable.ic_home,
                    R.drawable.avd_home,
                    R.id.chatHomeFragment
                ),
                CbnMenuItem(
                    R.drawable.ic_settings,
                    R.drawable.avd_settings,
                    R.id.settingsFragment
                ),
            )

            bottomNavView.setMenuItems(menuItems, 0)
            val navController = findNavController(R.id.fragmentContainerView2)
            bottomNavView.setupWithNavController(navController)
        }
    }
}
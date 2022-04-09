package com.sreshtha.chatappandroid.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.sreshtha.chatappandroid.R
import com.sreshtha.chatappandroid.databinding.FragmentLoginBinding

class LoginFragment:Fragment(){
    private var loginBinding: FragmentLoginBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding = FragmentLoginBinding.inflate(inflater,container,false)
        return loginBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginBinding?.apply {

            tvGotoSignup.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.goto_signupFragment)
            }


        }

    }

    override fun onDestroy() {
        super.onDestroy()
        loginBinding = null
    }
}
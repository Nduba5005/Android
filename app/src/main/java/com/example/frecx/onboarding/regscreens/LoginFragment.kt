package com.example.frecx.onboarding.regscreens


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.example.frecx.R
import com.example.frecx.auth.AuthListener
import com.example.frecx.auth.AuthViewModel
import com.example.frecx.databinding.FragmentLoginBinding


class LoginFragment : Fragment(),  AuthListener {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState:Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        val viewModel= ViewModelProvider(this)[AuthViewModel::class.java]
        binding.viewmodel= viewModel

        viewModel.authListener=this

        }

    override fun onStarted() {

    }

    override fun onFailure(message: String) {

    }

    override fun onSuccess(loginResponse: LiveData<String>) {

    }


}





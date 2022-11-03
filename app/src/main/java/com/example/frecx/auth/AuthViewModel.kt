package com.example.frecx.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.frecx.auth.repository.UserRepository

class AuthViewModel : ViewModel() {

    var userName1: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if (userName1.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure(("Invalid email of Password"))
            return
        }
        val loginResponse = UserRepository().userLogin(userName1!!, password!!)
        authListener?.onSuccess(loginResponse)
    }

}
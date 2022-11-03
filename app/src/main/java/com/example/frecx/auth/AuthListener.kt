package com.example.frecx.auth

import androidx.lifecycle.LiveData

interface AuthListener {

    fun onStarted()
    fun onFailure(message: String)
    fun onSuccess(loginResponse: LiveData<String>)
}
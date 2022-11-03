package com.example.frecx.auth.network

import android.provider.ContactsContract.CommonDataKinds.Email
import okhttp3.Call
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

class MyApi {
    @FormUrlEncoded
    @POST("login")
    abstract fun userLogin(
        @Field("username") useName1: String,
        @Field("email") email: Email,



}
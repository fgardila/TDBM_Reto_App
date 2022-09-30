package com.code93.tdbm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.themoviedb.org/3/"
const val API_KEY_KEY = "api_key"
const val API_KEY_VALUE = "c6e1df657271310383f951f2f7647e96"
const val LANGUAGE_KEY = "language"
const val LANGUAGE_VALUE = "es-MX"

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }
}
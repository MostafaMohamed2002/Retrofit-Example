package com.mostafadev.retrofit_tutorialseu.remote

import com.mostafadev.retrofit_tutorialseu.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {
    val charactersApi:CharactersApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(CharactersApi::class.java)
    }
}
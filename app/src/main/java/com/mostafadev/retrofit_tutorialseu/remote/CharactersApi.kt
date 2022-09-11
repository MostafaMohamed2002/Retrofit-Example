package com.mostafadev.retrofit_tutorialseu.remote

import com.mostafadev.retrofit_tutorialseu.model.Response
import retrofit2.Call
import retrofit2.http.GET

interface CharactersApi {
    @GET("character")
    fun getCharacter():Call<Response>
}
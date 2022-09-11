package com.mostafadev.retrofit_tutorialseu.remote

import com.mostafadev.retrofit_tutorialseu.model.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CharactersApi {
    @GET("character")
    fun getCharacter(@Query("page")page:String):retrofit2.Call<CharacterResponse>
}
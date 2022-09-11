package com.mostafadev.retrofit_tutorialseu.model


import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("name")
   val name:String,
    @SerializedName("image")
    val image:String

)
data class CharacterResponse(@SerializedName("results")val results: List<Character>)


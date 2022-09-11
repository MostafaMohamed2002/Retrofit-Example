package com.mostafadev.retrofit_tutorialseu.model


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)
package com.mostafadev.retrofit_tutorialseu.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Response(
    @Json(name = "info")
    val info: Info,
    @Json(name = "results")
    val results: List<Result>
)
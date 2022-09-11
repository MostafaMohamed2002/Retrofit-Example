package com.mostafadev.retrofit_tutorialseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mostafadev.retrofit_tutorialseu.model.Response
import com.mostafadev.retrofit_tutorialseu.remote.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api=RetrofitInstance.charactersApi.getCharacter("1")
        api.enqueue(object : Callback<Response> {
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}
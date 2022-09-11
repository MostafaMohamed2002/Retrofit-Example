package com.mostafadev.retrofit_tutorialseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mostafadev.retrofit_tutorialseu.model.Response
import com.mostafadev.retrofit_tutorialseu.remote.RetrofitInstance
import retrofit2.Call

class MainActivity : AppCompatActivity() {
    val tag:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val api=RetrofitInstance.charactersApi.getCharacter("2")
        api.enqueue(object : retrofit2.Callback<Response>
        {
            override fun onResponse(
                call: Call<Response>,
                response: retrofit2.Response<Response>)
            {

                    Log.i(tag, response.body().toString())

            }

            override fun onFailure(
                call: Call<Response>,
                t: Throwable)
            {
                TODO("Not yet implemented")
            }

        })
    }
}
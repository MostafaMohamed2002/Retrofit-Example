package com.mostafadev.retrofit_tutorialseu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mostafadev.retrofit_tutorialseu.adapter.Adapter
import com.mostafadev.retrofit_tutorialseu.model.CharacterResponse
import com.mostafadev.retrofit_tutorialseu.remote.RetrofitInstance
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call

class MainActivity : AppCompatActivity() {
    val tag:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.setHasFixedSize(true)




        val api=RetrofitInstance.charactersApi.getCharacter("2")
        api.enqueue(object : retrofit2.Callback<CharacterResponse>
        {
            override fun onResponse(
                call: Call<CharacterResponse>,
                characterResponse: retrofit2.Response<CharacterResponse>)
            {

                    Log.i(tag, characterResponse.body().toString())
                    val responseBody=characterResponse.body()!!
                recyclerView.adapter = Adapter(responseBody.results)


            }

            override fun onFailure(
                call: Call<CharacterResponse>,
                t: Throwable)
            {
Log.i(tag,"$t")            }

        })
    }
}
package com.example.wizard_world.data.remote

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails {

    const val BASE_URL = ""
    const val Elixirs = "https://wizard-world-api.herokuapp.com/Elixirs/"
    const val feedback = "https://wizard-world-api.herokuapp.com/Feedback/"
    const val Houses = "https://wizard-world-api.herokuapp.com/Houses/"
    const val Spells = "https://wizard-world-api.herokuapp.com/Spells/"
    const val Wizard = "https://wizard-world-api.herokuapp.com/Wizards/"

   fun getInstanceElixirs(Elixirs: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(Elixirs)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .client(client)
            .build()



         val client = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    })
    .build()

}



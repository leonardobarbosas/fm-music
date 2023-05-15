package com.example.mymusic.api.retrofit

import com.example.mymusic.api.constants.ConstantsApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApi {

    companion object{
        private lateinit var instance: Retrofit

        fun getRetrofit(): Retrofit{
            if(!::instance.isInitialized){
                instance = Retrofit
                    .Builder()
                    .baseUrl(ConstantsApi.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            }

            return instance
        }
    }

}
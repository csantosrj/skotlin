package com.example.skotlin.model.API

import com.example.skotlin.`interface`.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {
    companion object{
        private var retrofit: Retrofit?=null

        val client:Retrofit get(){
            if(retrofit == null){
                retrofit=Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(Constant.BASE_URL)
                    .build()
            }
            return retrofit!!
        }
    }
}
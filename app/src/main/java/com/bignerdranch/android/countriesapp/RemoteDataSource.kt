package com.bignerdranch.android.countriesapp

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path


interface RestCountriesApi {
    @GET("name/{name}")
    fun getCountryByName(@Path("name") cityName: String): List<Country>
}

var retrofit = Retrofit.Builder()
    .baseUrl("https://restcountries.com/v2/")
    .build()

var restCountriesApi = retrofit.create(RestCountriesApi::class.java)
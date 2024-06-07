package com.example.lab6_kot104

import retrofit2.Response
import retrofit2.http.GET

interface MovieService {
    @GET("Film")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}
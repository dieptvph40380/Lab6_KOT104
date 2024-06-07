package com.example.lab6_kot104

import androidx.compose.runtime.Composable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
@Composable
fun abcx(){

}

class MovieViewModel : ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()

    val movies: LiveData<List<Movie>> = _movies

    init {
        _movies.value = Movie.getSampleMovies()
    }

}
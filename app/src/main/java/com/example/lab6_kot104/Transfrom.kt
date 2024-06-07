package com.example.lab6_kot104

fun MovieResponse.toMovie(): Movie {
    return Movie(
        id = this.filmId,
        title = this.filmName,
        duration = this.duration,
        releaseDate = this.releaseDate,
        genre = this.genre,
        shotDescription = this.description,
        posterUrl = this.image
    )
}
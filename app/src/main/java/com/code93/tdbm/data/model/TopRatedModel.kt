package com.code93.tdbm.data.model

import com.code93.tdbm.domain.model.TopRatedMovieListResultEntity
import com.google.gson.annotations.SerializedName

data class TopRatedModel(
    val page: Int,
    val results: List<MovieListResultModel>,
    @SerializedName("total_results") val totalResults: Int,
    @SerializedName("total_pages") val totalPages: Int,
)

fun TopRatedModel.toEntity() : List<TopRatedMovieListResultEntity> {
    val list : MutableList<TopRatedMovieListResultEntity> = mutableListOf()
    results.forEach {
        list.add(
            TopRatedMovieListResultEntity(
                id = it.id,
                posterPath = it.posterPath,
                adult = it.adult,
                overview = it.overview,
                releaseDate = it.releaseDate,
                genreIds = it.genreIds,
                originalTitle = it.originalTitle,
                originalLanguage = it.originalLanguage,
                title = it.title,
                backdropPath = it.backdropPath,
                popularity = it.popularity,
                voteCount = it.voteCount,
                video = it.video,
                voteAverage = it.voteAverage
            )
        )
    }
    return list
}
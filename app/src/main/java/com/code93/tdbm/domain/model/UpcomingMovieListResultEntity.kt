package com.code93.tdbm.domain.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "upcoming")
data class UpcomingMovieListResultEntity(
    @PrimaryKey var id: Int,
    var posterPath: String?,
    var adult: Boolean?,
    var overview: String?,
    var releaseDate: String?,
    var genreIds: List<Int>?,
    var originalTitle: String?,
    var originalLanguage: String?,
    var title: String?,
    var backdropPath: String?,
    var popularity: Double?,
    var voteCount: Int?,
    var video: Boolean?,
    var voteAverage: Double?
)

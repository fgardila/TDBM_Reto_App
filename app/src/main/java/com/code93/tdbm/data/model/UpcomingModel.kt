package com.code93.tdbm.data.model

data class UpcomingModel(
    val page: Int,
    val results: List<MovieListResultModel>,
    val dates: DatesModel,
    val totalPages: String,
    val totalResults: String,
)

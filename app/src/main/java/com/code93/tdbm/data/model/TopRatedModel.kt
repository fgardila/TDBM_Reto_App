package com.code93.tdbm.data.model

data class TopRatedModel(
    val page: Int,
    val results: List<MovieListResultModel>,
    val totalResults: Int,
    val totalPages: Int,
)
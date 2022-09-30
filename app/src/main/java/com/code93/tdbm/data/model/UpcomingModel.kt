package com.code93.tdbm.data.model

import com.google.gson.annotations.SerializedName

data class UpcomingModel(
    @SerializedName("page") val page: Int,
    val results: List<MovieListResultModel>,
    val dates: DatesModel,
    @SerializedName("total_pages") val totalPages: String,
    @SerializedName("total_results") val totalResults: String,
)

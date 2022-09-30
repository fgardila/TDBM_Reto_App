package com.code93.tdbm.data.network

import com.code93.tdbm.core.API_KEY_KEY
import com.code93.tdbm.core.API_KEY_VALUE
import com.code93.tdbm.data.model.TopRatedModel
import com.code93.tdbm.data.model.UpcomingModel
import retrofit2.Response
import retrofit2.http.GET

interface TmdbApiClient {
    @GET("movie/upcoming?${API_KEY_KEY}=${API_KEY_VALUE}&language=es-MX")
    suspend fun getFirstPageMovieUpcoming(): Response<UpcomingModel>

    @GET("movie/top_rated?api_key=c6e1df657271310383f951f2f7647e96&language=es-MX")
    suspend fun getFirstPageMovieTopRated(): Response<TopRatedModel>
}
package com.code93.tdbm.data.network

import com.code93.tdbm.core.RetrofitHelper
import com.code93.tdbm.data.model.TopRatedModel
import com.code93.tdbm.data.model.UpcomingModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TmdbService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getFirstPageMovieUpcoming(): UpcomingModel? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(TmdbApiClient::class.java).getFirstPageMovieUpcoming()
            response.body()
        }
    }

    suspend fun getFirstPageMovieTopRated(): TopRatedModel? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(TmdbApiClient::class.java).getFirstPageMovieTopRated()
            response.body()
        }
    }
}
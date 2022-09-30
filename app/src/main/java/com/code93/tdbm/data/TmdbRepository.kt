package com.code93.tdbm.data

import com.code93.tdbm.TmdbApp
import com.code93.tdbm.data.model.TopRatedModel
import com.code93.tdbm.data.model.UpcomingModel
import com.code93.tdbm.data.network.TmdbService
import com.code93.tdbm.data.room.TmdbDao
import com.code93.tdbm.data.room.TmdbDatabase
import com.code93.tdbm.domain.model.TopRatedMovieListResultEntity
import com.code93.tdbm.domain.model.UpcomingMovieListResultEntity

class TmdbRepository {

    private val api = TmdbService()

    suspend fun getFirstPageMovieUpcoming(): UpcomingModel? {
        val response = api.getFirstPageMovieUpcoming()
        return response
    }

    suspend fun getFirstPageMovieTopRated(): TopRatedModel? {
        val response = api.getFirstPageMovieTopRated()
        return response
    }

    private val database = TmdbApp.database.tmdbDao()

    suspend fun getFirstPageMovieTopRatedFromDatabase(): List<TopRatedMovieListResultEntity> {
        val result = database.getAllTopRatedMovieList()
        return result
    }

    suspend fun getFirstPageMovieUpcomingFromDatabase(): List<UpcomingMovieListResultEntity> {
        val result = database.getAllUpcomingMovieList()
        return result
    }
}
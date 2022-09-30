package com.code93.tdbm.domain.useCase

import com.code93.tdbm.data.TmdbRepository
import com.code93.tdbm.data.model.toEntity
import com.code93.tdbm.domain.model.TopRatedMovieListResultEntity

class GetFirstPageMovieTopRatedUseCase {

    private val repository = TmdbRepository()

    suspend fun getFirstPageMovieTopRated(): List<TopRatedMovieListResultEntity> {
        val topRatedMovieListResultEntity = repository.getFirstPageMovieTopRatedFromDatabase()

        return if (topRatedMovieListResultEntity.isEmpty()) {
            topRatedMovieListResultEntity
        } else {
            getFirstPageMovieTopRatedFromNetwork()
        }
    }

    private suspend fun getFirstPageMovieTopRatedFromNetwork(): List<TopRatedMovieListResultEntity> {
        val response = repository.getFirstPageMovieTopRated()
        return response!!.toEntity()
    }
}
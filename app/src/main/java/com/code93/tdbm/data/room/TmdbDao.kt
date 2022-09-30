package com.code93.tdbm.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.code93.tdbm.domain.model.TopRatedMovieListResultEntity
import com.code93.tdbm.domain.model.UpcomingMovieListResultEntity

@Dao
interface TmdbDao {

    @Query("SELECT * FROM top_rated")
    fun getAllTopRatedMovieList() : List<TopRatedMovieListResultEntity>

    @Query("SELECT * FROM top_rated")
    fun getAllUpcomingMovieList() : List<UpcomingMovieListResultEntity>

    @Insert
    fun insertUpcomingFirstPage(upcomingModel: UpcomingMovieListResultEntity) : Long

    @Update
    fun updateUpcomingFirstPage(upcomingModel: UpcomingMovieListResultEntity)

    @Delete
    fun deleteUpcomingFirstPage(upcomingModel: UpcomingMovieListResultEntity)
}
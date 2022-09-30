package com.code93.tdbm.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.code93.tdbm.domain.model.TopRatedMovieListResultEntity
import com.code93.tdbm.domain.model.UpcomingMovieListResultEntity

@Database(
    entities = [UpcomingMovieListResultEntity::class, TopRatedMovieListResultEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(DataConverter::class)
abstract class TmdbDatabase : RoomDatabase() {
    abstract fun tmdbDao(): TmdbDao
}
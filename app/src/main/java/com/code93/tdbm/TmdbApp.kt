package com.code93.tdbm

import android.app.Application
import androidx.room.Room
import com.code93.tdbm.data.room.TmdbDatabase

class TmdbApp : Application() {

    companion object {
        lateinit var database: TmdbDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this, TmdbDatabase::class.java, "TmdbDatabase")
            .build()
    }
}
package com.code93.tdbm.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.code93.tdbm.domain.useCase.GetFirstPageMovieTopRatedUseCase
import com.code93.tdbm.domain.useCase.GetFirstPageMovieUpcomingUseCase
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    var getFirstPageMovieUpcomingUseCase = GetFirstPageMovieUpcomingUseCase()

    var getFirstPageMovieTopRatedUseCase = GetFirstPageMovieTopRatedUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getFirstPageMovieUpcomingUseCase()
            result?.let {
                val totalPages = it.totalPages
            }
            val top = getFirstPageMovieTopRatedUseCase.getFirstPageMovieTopRated()
        }
    }
}
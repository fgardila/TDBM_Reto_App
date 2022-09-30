package com.code93.tdbm.domain.useCase

import com.code93.tdbm.data.TmdbRepository
import com.code93.tdbm.data.model.UpcomingModel

class GetFirstPageMovieUpcomingUseCase {

    private val repository = TmdbRepository()

    suspend operator fun invoke(): UpcomingModel? = repository.getFirstPageMovieUpcoming()
}
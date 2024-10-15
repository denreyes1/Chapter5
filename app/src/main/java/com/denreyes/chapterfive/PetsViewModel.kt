package com.denreyes.chapterfive

import androidx.lifecycle.ViewModel
import com.denreyes.chapterfive.data.PetsRepository
import com.denreyes.chapterfive.data.PetsRepositoryImpl

class PetsViewModel(
    private val petsRepository: PetsRepository
): ViewModel() {

    fun getPets() = petsRepository.getPets()
}
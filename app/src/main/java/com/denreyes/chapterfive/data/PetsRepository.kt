package com.denreyes.chapterfive.data

interface PetsRepository {
    fun getPets() : List<Pet>
}
package com.denreyes.chapterfive.di

import com.denreyes.chapterfive.PetsViewModel
import com.denreyes.chapterfive.data.PetsRepository
import com.denreyes.chapterfive.data.PetsRepositoryImpl
import org.koin.dsl.module

val appModules = module {
    single<PetsRepository> { PetsRepositoryImpl() }
    single { PetsViewModel(get()) }
}
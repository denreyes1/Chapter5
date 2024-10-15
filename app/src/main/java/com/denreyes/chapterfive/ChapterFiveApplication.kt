package com.denreyes.chapterfive

import android.app.Application
import com.denreyes.chapterfive.di.appModules
import org.koin.core.context.startKoin

class ChapterFiveApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModules)
        }
    }
}
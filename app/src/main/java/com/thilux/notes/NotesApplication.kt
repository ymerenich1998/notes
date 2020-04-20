package com.thilux.notes

import android.app.Application
import timber.log.Timber

class NotesApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}
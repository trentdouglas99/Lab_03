package com.csci448.trentdouglas.lab02

import android.app.Application
import android.util.Log

// QuizApplication.kt
class QuizApplication : Application() {
    companion object {
        private const val LOG_TAG = "448.QuizApplication"
    }
    override fun onCreate() {
        super.onCreate()
        Log.d(LOG_TAG, "onCreate() called")
    }

}
package com.example.chernykhhomework

import android.app.Application
import com.example.chernykhhomework.di.AppComponent
import com.example.chernykhhomework.di.DaggerAppComponent

class LoanApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(this)
    }
}
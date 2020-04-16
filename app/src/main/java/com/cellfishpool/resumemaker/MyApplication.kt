package com.cellfishpool.resumemaker

import com.cellfishpool.resumemaker.di.Component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class MyApplication : DaggerApplication(){
    override fun onCreate() {
        super.onCreate()
        plantTimber()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
            return DaggerAppComponent.factory().create(this)
    }

    private fun plantTimber() {
        Timber.plant(Timber.DebugTree())
    }
}
package com.cellfishpool.resumemaker.di.Modules

import android.content.Context
import com.cellfishpool.resumemaker.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModules {
    @Provides
    @Singleton
    fun provideContext(application: MyApplication): Context {
        return application
    }
}
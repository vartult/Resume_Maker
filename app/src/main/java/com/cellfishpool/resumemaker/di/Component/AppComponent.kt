package com.cellfishpool.resumemaker.di.Component

import com.cellfishpool.resumemaker.MyApplication
import com.cellfishpool.resumemaker.di.Modules.AppModules
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(modules = [AppModules::class, AndroidInjectionModule::class])
@Singleton
interface AppComponent : AndroidInjector<MyApplication>{
    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<MyApplication>
}
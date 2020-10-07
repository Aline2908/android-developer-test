package com.ram.android_developer_test.di.modules

import android.app.Application
import android.content.Context
import com.ram.android_developer_test.application.InjectableApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object TestAppModule {

    @Provides
    @Singleton
    @JvmStatic
    fun providesContext(app: InjectableApplication): Context = app.applicationContext

    @Provides
    @Singleton
    @JvmStatic
    fun providesApplication(app: InjectableApplication): Application = app
}
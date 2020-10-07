package com.ram.android_developer_test.application

import com.ram.android_developer_test.di.component.DaggerMainComponent
import com.ram.android_developer_test.di.component.MainComponent

class MainApplication : TestApplication() {

    override fun initializeInjector() {
        component = DaggerMainComponent
            .builder()
            .application(this)
            .build()
            .apply {
                inject(this@MainApplication)
            }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    private fun getMainComponent() {
        component as MainComponent
    }

    companion object {
        lateinit var instance: MainApplication
            private set
    }
}
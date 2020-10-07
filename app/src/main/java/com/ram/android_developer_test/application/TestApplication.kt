package com.ram.android_developer_test.application

import com.ram.android_developer_test.di.component.BaseComponent

abstract class TestApplication : InjectableApplication() {

    var component: BaseComponent? = null
        protected set

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: TestApplication? = null
            private set
    }
}
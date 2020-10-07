package com.ram.android_developer_test.di.component

import android.app.Application
import android.content.Context
import com.ram.android_developer_test.application.InjectableApplication
import dagger.android.AndroidInjector

interface BaseComponent : AndroidInjector<InjectableApplication> {

    fun context(): Context

    fun application(): Application
}
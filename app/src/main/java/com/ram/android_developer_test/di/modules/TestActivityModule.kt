package com.ram.android_developer_test.di.modules

import com.ram.android_developer_test.scopes.ActivityScope
import com.ram.android_developer_test.ui.carpark.activity.CarParkActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class TestActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [CarParkModule::class]
    )
    abstract fun bindCarParkActivity(): CarParkActivity
}
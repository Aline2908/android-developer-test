package com.ram.android_developer_test.di.modules

import com.ram.android_developer_test.scopes.FragmentScope
import com.ram.android_developer_test.ui.carpark.fragment.CarParkFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkPayFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkRegisterFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkRegistryFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CarParkModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun providesCarParkFragment(): CarParkFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun providesCarParkRegistryFragment(): CarParkRegistryFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun providesCarParkRegisterFragment(): CarParkRegisterFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun providesCarParkPayFragment(): CarParkPayFragment

}
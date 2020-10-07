package com.ram.android_developer_test.di.component

import com.ram.android_developer_test.application.InjectableApplication
import com.ram.android_developer_test.di.modules.TestActivityModule
import com.ram.android_developer_test.di.modules.TestAppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        TestActivityModule::class,
        TestAppModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface MainComponent: BaseComponent {

    @Component.Builder
    interface Builder {
        fun build(): MainComponent

        @BindsInstance
        fun application(application: InjectableApplication) : Builder
    }
}
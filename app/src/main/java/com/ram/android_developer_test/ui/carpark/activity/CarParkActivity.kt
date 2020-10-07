package com.ram.android_developer_test.ui.carpark.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ram.android_developer_test.R
import com.ram.android_developer_test.ui.carpark.fragment.CarParkFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkPayFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkRegisterFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkRegistryFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class CarParkActivity : AppCompatActivity(),
    CarParkFragment.CarParkListener,
    CarParkRegistryFragment.CarParkRegistryListener,
    CarParkRegisterFragment.CarParkRegisterListener,
    CarParkPayFragment.CarParkPayListener,
    HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector() = dispatchingAndroidInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carpark)
    }

    override fun onChooseOption() {
    }

    override fun onChooseEnterOrExit() {
        TODO("Not yet implemented")
    }

    override fun onDoRegister() {
        TODO("Not yet implemented")
    }
}


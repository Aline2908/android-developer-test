package com.ram.android_developer_test.ui.carpark.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ram.android_developer_test.R
import com.ram.android_developer_test.ui.carpark.fragment.CarParkFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkPayFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkRegisterFragment
import com.ram.android_developer_test.ui.carpark.fragment.CarParkRegistryFragment

class CarParkActivity : AppCompatActivity(),
    CarParkFragment.CarParkListener,
    CarParkRegistryFragment.CarParkRegistryListener,
    CarParkRegisterFragment.CarParkRegisterListener,
    CarParkPayFragment.CarParkPayListener {

    override fun onCreate(savedInstanceState: Bundle?) {
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


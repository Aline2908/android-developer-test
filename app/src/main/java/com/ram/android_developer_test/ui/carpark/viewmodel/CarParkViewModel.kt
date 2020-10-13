package com.ram.android_developer_test.ui.carpark.viewmodel

import androidx.lifecycle.ViewModel
import com.ram.android_developer_test.di.models.CarType
import javax.inject.Inject

class CarParkViewModel @Inject constructor(

) : ViewModel() {

    var carList: MutableList<CarType> = mutableListOf()

    fun carRegister (plate: String, carType: Int) {
        carList.add(CarType (carType, plate))
    }

}
package com.ram.android_developer_test.ui.carpark.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.ram.android_developer_test.R
import com.ram.android_developer_test.databinding.FragmentRegisterBinding
import com.ram.android_developer_test.ui.carpark.viewmodel.CarParkViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CarParkRegisterFragment : Fragment(), AdapterView.OnItemSelectedListener {

    lateinit var binding: FragmentRegisterBinding

    private var listener: CarParkRegisterListener? = null

    @Inject
    lateinit var viewModel: CarParkViewModel

    var itemSelected: String = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
        listener = context as? CarParkRegisterListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onSelectedRegister()
        initOnCLickListener()
    }

    private fun initOnCLickListener() {
        binding.buttonCarRegister.setOnClickListener {
            val plate = binding.editTextPlate.text.toString()
            viewModel.carRegister(
                plate = plate,
                carType = validateCarType()
            )
        }
    }

    private fun onSelectedRegister() {
        binding.spinnerRegister.onItemSelectedListener = this
        val spinner: Spinner = binding.spinnerRegister
        ArrayAdapter.createFromResource(
            requireContext(), R.array.register_option, R.layout.support_simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        itemSelected = parent?.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    private fun validateCarType(): Int {
        return if (itemSelected.equals(resources.getString(R.string.register_oficial_car))) {
            1
        } else if (itemSelected.equals(resources.getString(R.string.register_car_resident))) {
            2
        } else {
            3
        }
    }

    interface CarParkRegisterListener {
        fun onDoRegister()
    }
}
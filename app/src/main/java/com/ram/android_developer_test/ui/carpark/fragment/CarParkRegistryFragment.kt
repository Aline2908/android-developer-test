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
import com.ram.android_developer_test.databinding.FragmentRegistryBinding
import com.ram.android_developer_test.ui.carpark.viewmodel.CarParkViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CarParkRegistryFragment : Fragment(), AdapterView.OnItemSelectedListener {

    lateinit var binding: FragmentRegistryBinding

    private var listener: CarParkRegistryListener? = null

    @Inject
    lateinit var viewModel: CarParkViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
        listener = context as? CarParkRegistryListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistryBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onSelectedRegistry()
    }

    private fun onSelectedRegistry() {
        val spinner: Spinner = binding.spinnerRegistry
        ArrayAdapter.createFromResource(
            requireContext(), R.array.registry_option, R.layout.support_simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    interface CarParkRegistryListener {
        fun onChooseEnterOrExit()
    }
}
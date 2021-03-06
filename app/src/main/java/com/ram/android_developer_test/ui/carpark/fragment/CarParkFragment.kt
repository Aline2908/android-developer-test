package com.ram.android_developer_test.ui.carpark.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ram.android_developer_test.R
import com.ram.android_developer_test.databinding.FragmentCarparkBinding
import dagger.android.support.AndroidSupportInjection

class CarParkFragment : Fragment() {

    lateinit var binding: FragmentCarparkBinding

    private var listener: CarParkListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
        listener = context as? CarParkListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarparkBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickListener()
    }

    private fun initClickListener() {
        binding.apply {
            buttonRegistry.setOnClickListener { v ->
                findNavController().navigate(R.id.carParkRegistryFragment)
            }
            buttonRegister.setOnClickListener { v ->
                findNavController().navigate(R.id.carParkRegisterFragment)
            }
            buttonPay.setOnClickListener { v ->
                findNavController().navigate(R.id.carParkPayFragment)
            }
        }
    }

    interface CarParkListener {
        fun onChooseOption()
    }
}
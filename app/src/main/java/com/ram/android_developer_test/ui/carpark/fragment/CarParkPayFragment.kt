package com.ram.android_developer_test.ui.carpark.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ram.android_developer_test.databinding.FragmentPayBinding

class CarParkPayFragment : Fragment() {

    lateinit var binding: FragmentPayBinding

    private var listener: CarParkPayListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? CarParkPayListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPayBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    interface CarParkPayListener {

    }
}
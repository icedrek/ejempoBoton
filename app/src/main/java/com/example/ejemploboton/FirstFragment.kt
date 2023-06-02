package com.example.ejemploboton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(TEXT_OF_FRAGMENT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {
        const val TEXT_OF_FRAGMENT = "param1"

        @JvmStatic
        fun newInstance(param1: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(TEXT_OF_FRAGMENT, param1)
                }
            }
    }
}
package com.example.ejemploboton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ejemploboton.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.loginAccept.setOnClickListener {
            val newFragment: Fragment

            newFragment = if (binding.textUser.text.toString() == "gabi" &&
                binding.textPassword.text.toString() == "hola"
            ) {
                FirstFragment()
            } else {
                SecondFragment()
            }

            val transaction = requireActivity().supportFragmentManager
                .beginTransaction()
            transaction.replace(R.id.fragment_container, newFragment)
            transaction.commit()
        }
        return binding.root
    }

}
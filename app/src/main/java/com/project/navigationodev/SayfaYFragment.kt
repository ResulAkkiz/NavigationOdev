package com.project.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.project.navigationodev.databinding.FragmentSayfaXBinding
import com.project.navigationodev.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private var _binding: FragmentSayfaYBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                //enabled:true ise back not working
                override fun handleOnBackPressed() {

                    Navigation.findNavController(binding.root).navigate(R.id.action_sayfaYFragment_to_anasayfaFragment)
                }

            })

        return binding.root
    }


}
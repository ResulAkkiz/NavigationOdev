package com.project.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.project.navigationodev.databinding.FragmentSayfaABinding
import com.project.navigationodev.databinding.FragmentSayfaBBinding
import com.project.navigationodev.databinding.FragmentSayfaXBinding


class SayfaBFragment : Fragment() {
    private var _binding: FragmentSayfaBBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.gitYButton2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaBFragment_to_sayfaYFragment)
        }
        return binding.root
    }


}
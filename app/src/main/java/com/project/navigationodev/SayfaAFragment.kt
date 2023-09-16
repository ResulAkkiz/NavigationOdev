package com.project.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.project.navigationodev.databinding.FragmentAnasayfaBinding
import com.project.navigationodev.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private var _binding: FragmentSayfaABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.gitBButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaAFragment_to_sayfaBFragment)
        }

        return binding.root
    }


}
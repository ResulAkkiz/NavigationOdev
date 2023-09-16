package com.project.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.project.navigationodev.databinding.FragmentAnasayfaBinding

// TODO: Rename parameter arguments, choose names that match

class AnasayfaFragment : Fragment() {
    private var _binding: FragmentAnasayfaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.gitAButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)
        }
        binding.gitXButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
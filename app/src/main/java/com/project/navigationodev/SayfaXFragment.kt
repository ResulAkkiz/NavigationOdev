package com.project.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.project.navigationodev.databinding.FragmentSayfaABinding
import com.project.navigationodev.databinding.FragmentSayfaXBinding

// TODO: Rename parameter arguments, choose names that match

class SayfaXFragment : Fragment() {
    private var _binding: FragmentSayfaXBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.gitYButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaXFragment_to_sayfaYFragment)
        }

        return binding.root
    }


}
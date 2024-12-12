package com.jordel.appmvvmjoel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jordel.appmvvmjoel.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val viewModel: HomeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHomeBinding.inflate(inflater)
        binding.botoLlistar.setOnClickListener{
            viewModel.getAlumnesPorEdat(binding.editTextEdat.text.toString())
            viewModel.getCantitatAlumnesPorEdat(binding.editTextEdat.text.toString())

            binding.cantitatAlumnes.text = viewModel.countEdat
            binding.LlistaAlumnes.text = viewModel.llistatAlumnes.toString().replace("[","").replace("]","")
        }

        return binding.root
    }
}
package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challengechapter3.databinding.FragmentFourBinding

class FragmentFour : Fragment() {

    private lateinit var binding: FragmentFourBinding

    val args: FragmentFourArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnScreenFour.setOnClickListener {
            val data = DataUser (
                binding.etSukuAwal.text.toString().toInt(),
                binding.etSelisih.text.toString().toInt(),
                binding.etSukuN.text.toString().toInt()
            )

            val deret = FragmentFourDirections.actionFragmentFourToFragmentThree(data,)
            it.findNavController().navigate(deret)
        }

    }

}
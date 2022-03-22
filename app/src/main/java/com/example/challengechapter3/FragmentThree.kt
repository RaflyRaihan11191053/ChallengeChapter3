package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challengechapter3.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {

    private lateinit var binding: FragmentThreeBinding

    val args: FragmentThreeArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userName = args.name
        binding.tvName.text = "Hello, $userName"

        binding.btnScreenThree.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentThree_to_fragmentFour)
        }
    }

}
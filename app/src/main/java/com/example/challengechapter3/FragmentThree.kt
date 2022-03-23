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
    ): View {
        binding = FragmentThreeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userName = args.name
        binding.tvName.text = "Hello, $userName"

        binding.btnScreenThree.setOnClickListener {
            val name = FragmentThreeDirections.actionFragmentThreeToFragmentFour(userName)
            it.findNavController().navigate(name)
        }

        with(binding) {
            val hasil = args.hasilDeret

            if (hasil != null) {
                val sukuAwal = hasil.sukuAwal
                val selisih = hasil.selisih
                val sukuN = hasil.sukuN

                val deretAritmatika = sukuAwal + selisih * (sukuN - 1)

                tvSukuAwal.text = "Suku awal: $sukuAwal"
                tvSelisih.text = "Selisih: $selisih"
                tvSukuN.text = "Suku ke-n: $sukuN"
                tvHasil.text = "Bilangan deret aritmatika yang kamu cari adalah: $deretAritmatika"
                btnScreenThree.visibility = View.GONE
                ivFragmentThree.visibility = View.VISIBLE
                tvSukuAwal.visibility = View.VISIBLE
                tvSelisih.visibility = View.VISIBLE
                tvSukuN.visibility = View.VISIBLE
                tvHasil.visibility = View.VISIBLE

            } else {
                tvSukuAwal.visibility = View.GONE
                tvSelisih.visibility = View.GONE
                tvSukuN.visibility = View.GONE
                tvHasil.visibility = View.GONE
            }
        }

    }

}
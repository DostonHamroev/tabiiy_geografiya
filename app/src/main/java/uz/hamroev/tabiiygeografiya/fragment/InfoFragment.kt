package uz.hamroev.tabiiygeografiya.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.tabiiygeografiya.R
import uz.hamroev.tabiiygeografiya.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {


    lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(layoutInflater, container, false)



        return binding.root
    }


}
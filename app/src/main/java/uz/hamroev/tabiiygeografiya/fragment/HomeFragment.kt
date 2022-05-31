package uz.hamroev.tabiiygeografiya.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.multcolor.adapter.ThemeAdapter
import uz.hamroev.tabiiygeografiya.R
import uz.hamroev.tabiiygeografiya.activity.PdfActivity
import uz.hamroev.tabiiygeografiya.cache.Cache
import uz.hamroev.tabiiygeografiya.databinding.FragmentHomeBinding
import uz.hamroev.tabiiygeografiya.model.Theme

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)


        loadData()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnThemeClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.pdfName = theme.themeName
                        }
                        1 -> {
                            Cache.pdfName = theme.themeName
                        }
                        2 -> {
                            Cache.pdfName = theme.themeName
                        }
                        3 -> {
                            Cache.pdfName = theme.themeName
                        }
                        4 -> {
                            Cache.pdfName = theme.themeName
                        }
                        5 -> {
                            Cache.pdfName = theme.themeName
                        }
                        6 -> {
                            Cache.pdfName = theme.themeName
                        }
                        7 -> {
                            Cache.pdfName = theme.themeName
                        }
                        8 -> {
                            Cache.pdfName = theme.themeName
                        }
                        9 -> {
                            Cache.pdfName = theme.themeName
                        }
                        10 -> {
                            Cache.pdfName = theme.themeName
                        }
                        11 -> {
                            Cache.pdfName = theme.themeName
                        }
                        12 -> {
                            Cache.pdfName = theme.themeName
                        }
                        13 -> {
                            Cache.pdfName = theme.themeName
                        }
                        14 -> {
                            Cache.pdfName = theme.themeName
                        }
                        15 -> {
                            Cache.pdfName = theme.themeName
                        }
                        16 -> {
                            Cache.pdfName = theme.themeName
                        }
                        17 -> {
                            Cache.pdfName = theme.themeName
                        }
                        18 -> {
                            Cache.pdfName = theme.themeName
                        }
                        19 -> {
                            Cache.pdfName = theme.themeName
                        }
                    }
                    startActivity(Intent(binding.root.context, PdfActivity::class.java))
                }

            })
        binding.rvTheme.adapter = themeAdapter


        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        list.add(Theme("Kirish"))
        list.add(Theme("A"))
        list.add(Theme("B"))
        list.add(Theme("V"))
        list.add(Theme("G"))
        list.add(Theme("D"))
        list.add(Theme("Y"))
        list.add(Theme("I"))
        list.add(Theme("T"))
        list.add(Theme("U"))
        list.add(Theme("F"))
        list.add(Theme("X"))
        list.add(Theme("CH"))
        list.add(Theme("SH"))
        list.add(Theme("Foydalanilgan Adabiyotlar"))
    }


}
package uz.hamroev.tabiiygeografiya.activity

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import uz.hamroev.multcolor.adapter.NavAdapter
import uz.hamroev.tabiiygeografiya.R
import uz.hamroev.tabiiygeografiya.cache.Cache
import uz.hamroev.tabiiygeografiya.databinding.ActivityHomeBinding
import uz.hamroev.tabiiygeografiya.model.Nav

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    private lateinit var listNav: ArrayList<Nav>
    private lateinit var navAdapter: NavAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Cache.init(this)


        binding.cardMenu.setOnClickListener {
            binding.drawerLayout.open()
        }
        binding.topLayout.setOnLongClickListener {
            val snack = Snackbar.make(it, "Created by  -  Doston Hamroyev", Snackbar.LENGTH_LONG)
            snack.show()
            true
        }

        val navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)

        loadNav()
        navAdapter = NavAdapter(this, listNav, object : NavAdapter.OnNavClickListener {
            override fun onCLick(nav: Nav, position: Int) {
                when (position) {
                    0 -> {
                        navController.popBackStack()
                        navController.navigate(R.id.homeFragment)
                        binding.drawerLayout.closeDrawers()
                    }
                    1 -> {
                        Cache.pdfName = "Intro"
                        startActivity(Intent(this@HomeActivity, PdfActivity::class.java))
                        binding.drawerLayout.closeDrawers()
                    }
                    2 -> {
                        Cache.pdfName = "Kirish"
                        startActivity(Intent(this@HomeActivity, PdfActivity::class.java))
                        binding.drawerLayout.closeDrawers()
                    }
                    3 -> {
                        finish()
                    }
                }
            }
        })
        binding.rvNav.adapter = navAdapter


    }

    private fun loadNav() {
        listNav = ArrayList()
        listNav.add(Nav("Home", R.drawable.ic_home))
        listNav.add(Nav("Intro", R.drawable.ic_rate))
        listNav.add(Nav("Info", R.drawable.ic_info))
        listNav.add(Nav("Exit", R.drawable.ic_exit))
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }
}
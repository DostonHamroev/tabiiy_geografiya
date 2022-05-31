package uz.hamroev.tabiiygeografiya.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import uz.hamroev.tabiiygeografiya.cache.Cache
import uz.hamroev.tabiiygeografiya.databinding.ActivityPdfBinding

class PdfActivity : AppCompatActivity() {

    lateinit var binding: ActivityPdfBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Cache.init(this)

        loadPdf()
    }

    private fun loadPdf() {
        when (Cache.pdfName) {
            "Kirish" -> {
                binding.pdfView.fromAsset("kirish.pdf").show()
            }
            "Intro" -> {
                binding.pdfView.fromAsset("intro.pdf").show()
            }
            "A" -> {
                binding.pdfView.fromAsset("a.pdf").show()
            }
            "B" -> {
                binding.pdfView.fromAsset("b.pdf").show()
            }
            "V" -> {
                binding.pdfView.fromAsset("v.pdf").show()
            }
            "G" -> {
                binding.pdfView.fromAsset("g.pdf").show()
            }
            "D" -> {
                binding.pdfView.fromAsset("d.pdf").show()
            }
            "Y" -> {
                binding.pdfView.fromAsset("y.pdf").show()
            }
            "I" -> {
                binding.pdfView.fromAsset("i.pdf").show()
            }
            "T" -> {
                binding.pdfView.fromAsset("t.pdf").show()
            }
            "U" -> {
                binding.pdfView.fromAsset("u.pdf").show()
            }
            "F" -> {
                binding.pdfView.fromAsset("f.pdf").show()
            }
            "X" -> {
                binding.pdfView.fromAsset("x.pdf").show()
            }
            "CH" -> {
                binding.pdfView.fromAsset("ch.pdf").show()
            }
            "SH" -> {
                binding.pdfView.fromAsset("sh.pdf").show()
            }
            "Foydalanilgan Adabiyotlar" -> {
                binding.pdfView.fromAsset("foydalanilgan_adabiyotlar.pdf").show()
            }
        }
    }
}
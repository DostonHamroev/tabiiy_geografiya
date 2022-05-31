package uz.hamroev.tabiiygeografiya.cache

import android.content.Context
import android.content.SharedPreferences

object Cache {

    private const val NAME = "tabiiygeografiya"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var pdfName: String?
        get() = sharedPreferences.getString("pdfname", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("pdfname", value)
            }
        }


}

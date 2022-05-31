package uz.hamroev.multcolor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.tabiiygeografiya.databinding.ItemThemeBinding
import uz.hamroev.tabiiygeografiya.model.Theme

class ThemeAdapter(
    var context: Context,
    var list: ArrayList<Theme>,
    var onThemeClickListener: OnThemeClickListener
) :
    RecyclerView.Adapter<ThemeAdapter.VhTheme>() {

    inner class VhTheme(var itemThemeBinding: ItemThemeBinding) :
        RecyclerView.ViewHolder(itemThemeBinding.root) {


        fun onBind(theme: Theme, position: Int) {
            itemThemeBinding.themeName.text = theme.themeName

            itemThemeBinding.card.setOnClickListener {
                onThemeClickListener.onClick(theme, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhTheme {
        return VhTheme(ItemThemeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhTheme, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size


    interface OnThemeClickListener {
        fun onClick(theme: Theme, position: Int)
    }


}
package com.mostafadev.retrofit_tutorialseu.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mostafadev.retrofit_tutorialseu.model.Character
import com.mostafadev.retrofit_tutorialseu.model.CharacterResponse
import kotlinx.android.synthetic.main.item.view.*

class Adapter(private val character:List<CharacterResponse>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(character: Character) {
            itemView.textView.text=character.name
            itemView.imageView=
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView
    }

    override fun getItemCount(): Int {
        return character.size
    }
}
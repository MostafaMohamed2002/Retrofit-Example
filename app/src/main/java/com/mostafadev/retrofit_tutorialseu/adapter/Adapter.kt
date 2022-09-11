package com.mostafadev.retrofit_tutorialseu.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.bumptech.glide.Glide
import com.mostafadev.retrofit_tutorialseu.R
import com.mostafadev.retrofit_tutorialseu.model.Character
import com.mostafadev.retrofit_tutorialseu.model.CharacterResponse
import kotlinx.android.synthetic.main.item.view.*

class Adapter(private val character:List<Character>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        companion object{
            fun from(parent: ViewGroup):ViewHolder{
                val layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
                return ViewHolder(layoutInflater)
            }
        }










        fun bindData(character: Character) {
            itemView.textView.text=character.name
             val image=itemView.imageView


            Glide.with(itemView)
                .load(character.image)
                .circleCrop()
                .into(image)



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(character[position])

    }

    override fun getItemCount(): Int {
        return character.size
    }
}
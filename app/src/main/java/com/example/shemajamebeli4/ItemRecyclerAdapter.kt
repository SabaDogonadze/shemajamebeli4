package com.example.shemajamebeli4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shemajamebeli4.databinding.Item2RecyclerviewBinding
import com.example.shemajamebeli4.databinding.Item3RecyclerviewBinding
import com.example.shemajamebeli4.databinding.ItemRecyclerviewBinding

class ItemRecyclerAdapter(): ListAdapter<DataItem, RecyclerView.ViewHolder>(object : DiffUtil.ItemCallback<DataItem>(){
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id


    }

    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
      return oldItem == newItem
    }

}) {



    companion object{
        const val TEXT = 1
        const val FILE = 2
        const val VOICE = 3
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       return if(viewType == TEXT){
           TextViewHolder(ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
       }else if (viewType == FILE){
           FileViewHolder(Item2RecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
       }else{
           VoiceViewHolder(Item3RecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
       }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is TextViewHolder){
            holder.bind()
        }else if (holder is FileViewHolder){
            holder.bind()
        }else if(holder is VoiceViewHolder){
            holder.bind()
        }
    }


    override fun getItemViewType(position: Int): Int {
        return if(currentList[position].itemType == ItemType.TEXT){
            TEXT
        }else if (currentList[position].itemType == ItemType.FILE){
            FILE
        }else
            VOICE
    }

    inner class TextViewHolder(private val binding: ItemRecyclerviewBinding): RecyclerView.ViewHolder(binding.root){

        fun bind() {
            val item = currentList[adapterPosition]


        }

    }

    inner class FileViewHolder(private val binding: Item2RecyclerviewBinding): RecyclerView.ViewHolder(binding.root){

        fun bind() {
            val item = currentList[adapterPosition]


        }

    }

    inner class VoiceViewHolder(private val binding: Item3RecyclerviewBinding): RecyclerView.ViewHolder(binding.root){

        fun bind() {
            val item = currentList[adapterPosition]


        }

    }


}
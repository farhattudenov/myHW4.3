package com.geeks.mycw43.adapter

import android.os.Parcel
import android.os.Parcelable
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geeks.mycw43.databinding.ItemContactBinding

class ContactAdapter() : ListAdapter <String,ContactAdapter.ContactViewHolder> (
    object:DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String)=oldItem==newItem

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            TODO("Not yet implemented")
        }

    }
) {

    inner  class ContactViewHolder(
        private val binding: ItemContactBinding
    ): ViewHolder(binding.root){

        fun bind(contact:String) {
            binding.tvPhone.text= contact
        }
    }


}
package com.example.wizard_world.ui.spells

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wizard_world.R
import com.example.wizard_world.data.model.spells.SpellsModelItemModel
import com.example.wizard_world.databinding.ItemSpellsBinding

class SpellsAdapter(val spells: ArrayList<SpellsModelItemModel>) :
    RecyclerView.Adapter<SpellsAdapter.ViewHolder>() {
    class ViewHolder (val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemSpellsBinding.bind(view)
        fun handleData(item: SpellsModelItemModel?) {
            binding.spellsName.text = item?.name
            binding.spellsName1.text = item?.creator
            binding.spellsName2.text =item?.effect


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_spells, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: SpellsAdapter.ViewHolder, position: Int) {
        holder.handleData(spells?.get(position))
    }

    override fun getItemCount(): Int = spells?.size ?: 0

    }




package com.example.wizard_world.ui.elixirs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wizard_world.R
import com.example.wizard_world.data.model.elixirs.ElixirModelItemModel
import com.example.wizard_world.databinding.ItemElixirBinding

class ElixirAdapter(val elixir: ArrayList<ElixirModelItemModel>):
    RecyclerView.Adapter<ElixirAdapter.ViewHolder>() {


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemElixirBinding.bind(view)

        fun handleData(item: ElixirModelItemModel?){
            binding.elixirName.text = item?.name
            binding.elixirName1.text= item?.effect
            binding.elixirName2.text = item?.sideEffects.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElixirAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_elixir, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ElixirAdapter.ViewHolder, position: Int) {
       holder.handleData(elixir?.get(position))

    }
    override fun getItemCount(): Int = elixir?.size ?: 0

    }




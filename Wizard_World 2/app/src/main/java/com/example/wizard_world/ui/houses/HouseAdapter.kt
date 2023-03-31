package com.example.wizard_world.ui.houses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wizard_world.R
import com.example.wizard_world.data.model.houses.HousesModelItemModel
import com.example.wizard_world.databinding.ItemHouseBinding
import com.example.wizard_world.ui.wizard.WizardAdapter

class HouseAdapter(val house: ArrayList<HousesModelItemModel>) :
    RecyclerView.Adapter<HouseAdapter.ViewHolder>() {
    class ViewHolder(val view: View) :RecyclerView.ViewHolder(view){
        fun handleData(item: HousesModelItemModel?) {
            binding.houseName.text= item?.animal
            binding.houseName1.text=item?.houseColours
            binding.houseName2.text=item?.commonRoom

        }

        private val binding = ItemHouseBinding.bind(view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_house, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = house?.size ?: 0



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.handleData(house?.get(position))

    }

}

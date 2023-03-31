package com.example.wizard_world.ui.wizard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wizard_world.R
import com.example.wizard_world.data.model.wizard.WizardModelItemModel
import com.example.wizard_world.databinding.ItemWizardBinding
class WizardAdapter(val wizard: ArrayList<WizardModelItemModel>) :
    RecyclerView.Adapter<WizardAdapter.ViewHolder>() {


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemWizardBinding.bind(view)
        fun handleData(item: WizardModelItemModel?) {
            binding.wizardName.text = item?.firstName
            binding.wizardName1.text = item?.lastName
            binding.wizardName2.text = item?.id



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wizard, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.handleData(wizard?.get(position))
    }

    override fun getItemCount(): Int = wizard?.size ?: 0


}



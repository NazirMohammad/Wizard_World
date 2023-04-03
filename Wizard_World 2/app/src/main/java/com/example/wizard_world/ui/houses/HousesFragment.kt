package com.example.wizard_world.ui.houses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wizard_world.data.model.houses.HousesModelItemModel
import com.example.wizard_world.databinding.FragmentHouseBinding
import com.example.wizard_world.databinding.FragmentSpellsBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList

@AndroidEntryPoint
class HousesFragment : Fragment() {

    private var _binding: FragmentHouseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel by viewModels<HousesViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentHouseBinding.inflate(inflater, container, false)
        viewModel.house.observe(viewLifecycleOwner){
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getHouse()
        return binding.root

    }

    private fun setupUI(house: ArrayList<HousesModelItemModel>) {
        binding.fragmentHouses.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = HouseAdapter(house)
        }
    }

}
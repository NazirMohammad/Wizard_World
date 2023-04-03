package com.example.wizard_world.ui.spells

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wizard_world.data.model.spells.SpellsModelItemModel
import com.example.wizard_world.databinding.FragmentSpellsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SpellsFragment : Fragment() {

    private var _binding: FragmentSpellsBinding? = null

    private val binding get() = _binding!!

    private val viewModel by viewModels<SpellsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentSpellsBinding.inflate(inflater, container, false)
        viewModel.spells.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getSpells()
        return binding.root
    }

    private fun setupUI(spells: ArrayList<SpellsModelItemModel>) {
        binding.fragmentSpells.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = SpellsAdapter(spells)
        }
    }

}
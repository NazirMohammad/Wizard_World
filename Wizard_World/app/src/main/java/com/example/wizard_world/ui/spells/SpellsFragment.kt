package com.example.wizard_world.ui.spells

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wizard_world.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SpellsFragment : Fragment() {

    companion object {
        fun newInstance() = SpellsFragment()
    }

    private lateinit var viewModel: SpellsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_spells, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpellsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
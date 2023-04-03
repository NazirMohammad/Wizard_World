package com.example.wizard_world.ui.elixirs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wizard_world.data.model.elixirs.ElixirModelItemModel
import com.example.wizard_world.databinding.FragmentElixirsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ElixirsFragment : Fragment() {

    private var _binding: FragmentElixirsBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<ElixirsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding= FragmentElixirsBinding.inflate(inflater,container, false)
viewModel.elixir.observe(viewLifecycleOwner){
    it?.let {
        setupUI(it)
    }
}
        viewModel.getElixir()
        return binding.root
    }

    private fun setupUI(elixir: ArrayList<ElixirModelItemModel>) {
        binding.fragmentElixirs.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ElixirAdapter(elixir)
        }

    }


}
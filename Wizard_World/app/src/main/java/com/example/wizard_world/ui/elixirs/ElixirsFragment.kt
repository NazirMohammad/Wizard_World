package com.example.wizard_world.ui.elixirs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wizard_world.R
import com.example.wizard_world.data.model.elixirs.ElixirModel
import com.example.wizard_world.databinding.FragmentElixirsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ElixirsFragment : Fragment() {

    private var _binding: FragmentElixirsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ElixirsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        viewModel= ViewModelProvider(this)(ElixirsViewModel::Elixir)
        _binding= FragmentElixirsBinding.inflate(inflater,container, false)
        return inflater.inflate(R.layout.fragment_elixirs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ElixirsViewModel::class.java)
        /
    }

}
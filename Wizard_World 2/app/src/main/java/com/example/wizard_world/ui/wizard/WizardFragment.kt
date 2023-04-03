package com.example.wizard_world.ui.wizard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wizard_world.data.model.wizard.WizardModelItemModel
import com.example.wizard_world.databinding.FragmentWizardBinding
import com.example.wizard_world.ui.elixirs.ElixirAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WizardFragment : Fragment() {

    private var _binding: FragmentWizardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel by viewModels<WizardViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentWizardBinding.inflate(inflater, container, false)
        viewModel.wizard.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getWizard()
            return binding.root
        }



        fun setupUI(wizard: ArrayList<WizardModelItemModel>) {
            binding.fragmentWizard.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = WizardAdapter(wizard)


            }
        }
    }



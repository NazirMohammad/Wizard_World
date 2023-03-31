package com.example.wizard_world.ui.spells

import androidx.lifecycle.ViewModel
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class SpellsViewModel @Inject constructor(
    val repository: Repository

): ViewModel() {
    // TODO: Implement the ViewModel
}
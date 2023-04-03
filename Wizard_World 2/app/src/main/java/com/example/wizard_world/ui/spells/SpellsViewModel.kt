package com.example.wizard_world.ui.spells

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizard_world.data.model.spells.SpellsModelItemModel
import com.example.wizard_world.data.model.wizard.WizardModelItemModel
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class SpellsViewModel @Inject constructor(
    val repository: Repository

): ViewModel() {

    val spells = MutableLiveData<ArrayList<SpellsModelItemModel>>().apply {
    }
    fun getSpells() {
        viewModelScope.launch {

            spells.postValue(repository.getSpells())

        }
    }
}


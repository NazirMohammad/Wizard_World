package com.example.wizard_world.ui.houses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizard_world.data.model.houses.HousesModelItemModel
import com.example.wizard_world.data.model.wizard.WizardModelItemModel
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HousesViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {

    val house = MutableLiveData<ArrayList<HousesModelItemModel>>().apply {
    }

    fun getHouse() {
        viewModelScope.launch {

            house.postValue(repository.getHouse())
        }
    }
}
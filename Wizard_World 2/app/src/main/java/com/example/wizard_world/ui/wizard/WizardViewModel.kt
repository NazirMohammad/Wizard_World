package com.example.wizard_world.ui.wizard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizard_world.data.model.wizard.WizardModelItemModel
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WizardViewModel @Inject constructor(
    val repository: Repository
)

    : ViewModel() {

     val wizard = MutableLiveData<ArrayList<WizardModelItemModel>>().apply {
     }
 fun getWizard() {
     viewModelScope.launch {

         wizard.postValue(repository.getWizard())

     }
 }
    }
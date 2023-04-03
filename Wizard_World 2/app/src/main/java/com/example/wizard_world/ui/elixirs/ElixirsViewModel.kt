package com.example.wizard_world.ui.elixirs

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizard_world.data.model.elixirs.ElixirModel
import com.example.wizard_world.data.model.elixirs.ElixirModelItemModel
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ElixirsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val elixir = MutableLiveData<ArrayList<ElixirModelItemModel>>()

    fun getElixir() {
        viewModelScope.launch {
            elixir.postValue(repository.getElixir())
        }
    }
}
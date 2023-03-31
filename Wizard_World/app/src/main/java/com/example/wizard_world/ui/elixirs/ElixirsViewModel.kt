package com.example.wizard_world.ui.elixirs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizard_world.data.model.elixirs.ElixirModel
import com.example.wizard_world.data.remote.ApiDetails
import com.example.wizard_world.data.remote.ApiRequest
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class ElixirsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text


    val Elixir = MutableLiveData<ElixirModel>()

    fun getElixir() {
        val result =
            ApiDetails.getInstanceElixirs(ApiDetails.Elixirs).create(ApiRequest::class.java)
        viewModelScope.launch {
            val result = result.getElixir()
            Elixir.postValue(result)
        }
    }
}


}
}

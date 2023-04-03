package com.example.wizard_world.ui.feedback

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizard_world.data.model.feedback.FeedbackModel
import com.example.wizard_world.data.remote.ApiDetails.feedback
import com.example.wizard_world.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedbackViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {

    val feedback = MutableLiveData<FeedbackModel>()



    fun postFeedback() {
        viewModelScope.launch{
            val result = repository.getFeedback(FeedbackModel())
            if(result.isSuccessful)//success
                else("failed")
        }

    }
}
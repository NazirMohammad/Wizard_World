package com.example.wizard_world.data.repository

import com.example.wizard_world.data.model.feedback.FeedbackModel
import com.example.wizard_world.data.remote.ApiRequest
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val apiRequest: ApiRequest
) : Repository {

    override suspend fun getElixir() = apiRequest.getElixir()

    override suspend fun getFeedback(feedback: FeedbackModel) = apiRequest.getFeedback(feedback)

    override suspend fun getHouse() = apiRequest.getHouse()

    override suspend fun getSpells() = apiRequest.getSpells()

    override suspend fun getWizard() = apiRequest.getWizard()
}


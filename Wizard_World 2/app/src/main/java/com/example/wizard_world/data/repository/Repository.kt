package com.example.wizard_world.data.repository

import com.example.wizard_world.data.model.elixirs.ElixirModel
import com.example.wizard_world.data.model.elixirs.ElixirModelItemModel
import com.example.wizard_world.data.model.feedback.FeedbackModel
import com.example.wizard_world.data.model.houses.HousesModel
import com.example.wizard_world.data.model.spells.SpellsModel
import com.example.wizard_world.data.model.wizard.WizardModel
import okhttp3.Response

interface Repository {

    suspend fun getElixir(): ArrayList<ElixirModelItemModel>

    suspend fun getFeedback(feedback: FeedbackModel): Response

    suspend fun getHouse(): HousesModel

    suspend fun getSpells(): SpellsModel

    suspend fun getWizard(): WizardModel
}
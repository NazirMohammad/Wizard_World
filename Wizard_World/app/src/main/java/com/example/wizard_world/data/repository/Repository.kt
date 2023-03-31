package com.example.wizard_world.data.repository

import com.example.wizard_world.data.model.elixirs.ElixirModel
import com.example.wizard_world.data.model.feedback.FeedbackModel
import com.example.wizard_world.data.model.houses.HousesModel
import com.example.wizard_world.data.model.spells.SpellsModel
import com.example.wizard_world.data.model.wizard.WizardModel

interface Repository {


    suspend fun getElixir(): ElixirModel

    suspend fun getFeedback(): FeedbackModel

    suspend fun getHouse(): HousesModel

    suspend fun getSpells(): SpellsModel

    suspend fun getWizard(): WizardModel
}
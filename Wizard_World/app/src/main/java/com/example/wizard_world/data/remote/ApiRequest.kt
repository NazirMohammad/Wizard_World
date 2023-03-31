package com.example.wizard_world.data.remote

import com.example.wizard_world.data.model.feedback.FeedbackModel
import com.example.wizard_world.ui.elixirs.ElixirsViewModel
import com.example.wizard_world.ui.houses.HousesViewModel
import com.example.wizard_world.ui.spells.SpellsViewModel
import com.example.wizard_world.ui.wizard.WizardViewModel
import retrofit2.http.GET

interface ApiRequest {
    @GET(ApiDetails.Elixirs)
    suspend fun getElixir():ElixirsViewModel


    @GET(ApiDetails.feedback)
    suspend fun getFeedback(): FeedbackModel

    @GET(ApiDetails.Houses)
    suspend fun getHouse(): HousesViewModel


    @GET(ApiDetails.Spells)
    suspend fun getSpells(): SpellsViewModel

    @GET(ApiDetails.Wizard)
    suspend fun getWizard(): WizardViewModel


}
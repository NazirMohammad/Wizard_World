package com.example.wizard_world.data.remote

import com.example.wizard_world.data.model.elixirs.ElixirModel
import com.example.wizard_world.data.model.elixirs.ElixirModelItemModel
import com.example.wizard_world.data.model.feedback.FeedbackModel
import com.example.wizard_world.data.model.houses.HousesModel
import com.example.wizard_world.data.model.spells.SpellsModel
import com.example.wizard_world.data.model.wizard.WizardModel
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.QueryName

interface ApiRequest {

    @GET(ApiDetails.Elixirs)
    suspend fun getElixir(): ArrayList<ElixirModelItemModel>

    @POST(ApiDetails.feedback)
    suspend fun getFeedback(
        @Body requestData: FeedbackModel
    ): Response

    @GET(ApiDetails.Houses)
    suspend fun getHouse(): HousesModel

    @GET(ApiDetails.Spells)
    suspend fun getSpells(): SpellsModel

    @GET(ApiDetails.Wizard)
    suspend fun getWizard(): WizardModel


}
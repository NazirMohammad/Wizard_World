package com.example.wizard_world.data.model.wizard


import com.google.gson.annotations.SerializedName

data class WizardModelItemModel(
    @SerializedName("elixirs")
    val elixirs: List<ElixirModel?>? = listOf(),
    @SerializedName("firstName")
    val firstName: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("lastName")
    val lastName: String? = ""
)
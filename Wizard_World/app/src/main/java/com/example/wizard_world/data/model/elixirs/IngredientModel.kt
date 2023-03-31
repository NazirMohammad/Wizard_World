package com.example.wizard_world.data.model.elixirs


import com.google.gson.annotations.SerializedName

data class IngredientModel(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = ""
)
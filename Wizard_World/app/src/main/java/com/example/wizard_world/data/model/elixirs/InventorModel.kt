package com.example.wizard_world.data.model.elixirs


import com.google.gson.annotations.SerializedName

data class InventorModel(
    @SerializedName("firstName")
    val firstName: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("lastName")
    val lastName: String? = ""
)
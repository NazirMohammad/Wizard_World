package com.example.wizard_world.data.model.houses


import com.google.gson.annotations.SerializedName

data class TraitModel(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = ""
)
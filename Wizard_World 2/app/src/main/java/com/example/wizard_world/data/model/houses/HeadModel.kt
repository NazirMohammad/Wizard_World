package com.example.wizard_world.data.model.houses


import com.google.gson.annotations.SerializedName

data class HeadModel(
    @SerializedName("firstName")
    val firstName: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("lastName")
    val lastName: String? = ""
)
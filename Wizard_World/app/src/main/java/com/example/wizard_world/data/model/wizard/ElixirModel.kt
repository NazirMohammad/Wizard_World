package com.example.wizard_world.data.model.wizard


import com.google.gson.annotations.SerializedName

data class ElixirModel(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = ""
)
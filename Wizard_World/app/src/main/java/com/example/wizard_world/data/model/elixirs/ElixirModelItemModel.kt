package com.example.wizard_world.data.model.elixirs


import com.google.gson.annotations.SerializedName

data class ElixirModelItemModel(
    @SerializedName("characteristics")
    val characteristics: String? = "",
    @SerializedName("difficulty")
    val difficulty: String? = "",
    @SerializedName("effect")
    val effect: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("ingredients")
    val ingredients: List<IngredientModel?>? = listOf(),
    @SerializedName("inventors")
    val inventors: List<InventorModel?>? = listOf(),
    @SerializedName("manufacturer")
    val manufacturer: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("sideEffects")
    val sideEffects: String? = "",
    @SerializedName("time")
    val time: String? = ""
)
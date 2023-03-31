package com.example.wizard_world.data.model.feedback


import com.google.gson.annotations.SerializedName

data class FeedbackModel(
    @SerializedName("entityId")
    val entityId: String? = "",
    @SerializedName("feedback")
    val feedback: String? = "",
    @SerializedName("feedbackType")
    val feedbackType: String? = ""
)
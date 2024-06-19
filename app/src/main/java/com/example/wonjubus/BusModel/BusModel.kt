package com.example.wonjubus.BusModel

import com.google.gson.annotations.SerializedName

data class BusModel(
    @SerializedName("response")
    val response: Response
)
package com.example.wonjubus.BusModel


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("gpslati")
    val gpslati: Double,
    @SerializedName("gpslong")
    val gpslong: Double,
    @SerializedName("nodeid")
    val nodeid: String,
    @SerializedName("nodenm")
    val nodenm: String,
    @SerializedName("nodeno")
    val nodeno: Int,
    @SerializedName("nodeord")
    val nodeord: Int,
    @SerializedName("RouteNo")
    val RouteNo: String,
    @SerializedName("updowncd")
    val updowncd: Int
)
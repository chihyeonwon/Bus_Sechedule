package com.example.wonjubus.data

import android.os.Parcelable
import com.example.wonjubus.BusModel.BusModel
import com.example.wonjubus.BusModel.Item
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BusData(
    val gpslati: Double,
    val gpslong: Double,
    val nodeid: String?,
    val nodenm: String?,
    val nodeno: Int?,
    val nodeord: Int?,
    val routeid: String?,
    val updowncd: Int?
): Parcelable

fun Item.toBusData() = BusData(
    gpslati = this.gpslati,
    gpslong = this.gpslong,
    nodeid = this.nodeid,
    nodenm = this.nodenm,
    nodeno = this.nodeno,
    nodeord = this.nodeord,
    routeid = this.RouteNo,
    updowncd = this.updowncd,
)

fun BusModel.toBusDataList(): List<BusData>? {
    return response.body.items.item?.map { it.toBusData() }?.toList()
}
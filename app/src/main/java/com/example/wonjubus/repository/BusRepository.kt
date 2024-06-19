package com.example.wonjubus.repository

import com.example.wonjubus.BusModel.BusModel
import com.example.wonjubus.network.RetrofitInstance
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class BusRepository {
    suspend fun getBus(): BusModel = withContext(IO) {
        RetrofitInstance.service.getBus(1,100,32020,"WJB251000068","json")
    }
}
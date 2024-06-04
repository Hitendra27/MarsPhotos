package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotosRespository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRespository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
package com.example.marsphotos.fake

import com.example.marsphotos.data.MarsPhotosRespository
import com.example.marsphotos.network.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRespository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
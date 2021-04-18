package com.gui.antonio.remote.source

import com.gui.antonio.data.model.PostData
import com.gui.antonio.data.repository.RemoteDataSource
import com.gui.antonio.remote.api.Service
import com.gui.antonio.remote.mapper.Mapper
import com.gui.antonio.remote.model.PostRemote
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val service: Service,
    private val mapper: Mapper<PostRemote, PostData>
) : RemoteDataSource {
    override fun getPosts(): List<PostData> = service.getPosts().map { mapper.from(it) }
}
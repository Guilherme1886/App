package com.gui.antonio.data.repository

import com.gui.antonio.data.model.PostData
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getPosts(): List<PostData>
}
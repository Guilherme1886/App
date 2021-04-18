package com.gui.antonio.remote.api

import com.gui.antonio.remote.model.PostRemote
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {

    @GET("/posts")
    fun getPosts(): List<PostRemote>

    @GET("/posts/{id}")
    fun getPost(@Path("id") id: Int): PostRemote

}
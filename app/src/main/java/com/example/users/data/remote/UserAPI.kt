package com.example.users.data.remote

import com.example.users.domain.module.User
import retrofit2.http.GET

interface UserAPI {

    @GET("users")
    suspend fun getAllUsers():List<UserDto>
}
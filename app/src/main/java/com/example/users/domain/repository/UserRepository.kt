package com.example.users.domain.repository

import com.example.users.domain.module.User
import com.example.users.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getAllUsers(): Flow<Resource<List<User>>>
}
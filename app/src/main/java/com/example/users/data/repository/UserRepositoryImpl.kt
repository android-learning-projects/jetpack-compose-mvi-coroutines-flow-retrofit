package com.example.users.data.repository

import android.util.Log
import com.example.users.data.mapper.toUserList
import com.example.users.data.remote.UserAPI
import com.example.users.domain.module.User
import com.example.users.domain.repository.UserRepository
import com.example.users.domain.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userAPI: UserAPI) : UserRepository {
    override suspend fun getAllUsers(): Flow<Resource<List<User>>> = flow {
        try {
            val data = userAPI.getAllUsers().toUserList()
            emit(Resource.Success(data))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Resource.Error(e.message ?: "An unknown error occurred."))
        }
    }
}
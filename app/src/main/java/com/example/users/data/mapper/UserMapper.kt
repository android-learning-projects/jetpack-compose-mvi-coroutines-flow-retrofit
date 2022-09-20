package com.example.users.data.mapper

import com.example.users.data.remote.UserDto
import com.example.users.domain.module.User


fun UserDto.toUser(): User {
    return User(
        id = id,
        name = name,
        email = email, gender = gender, status = status
    )
}

fun List<UserDto>.toUserList(): List<User> {
    return map {
        it.toUser()
    }
}
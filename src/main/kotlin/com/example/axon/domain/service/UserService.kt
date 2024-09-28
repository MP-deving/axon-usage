package com.example.axon.domain.service

import com.example.axon.domain.mappers.UserMapper
import com.example.axon.domain.models.UserModel
import com.example.axon.infrastructure.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    fun create(user: UserModel): UserModel {
        val encryptedPassword = passwordEncoder.encode(user.password)
        val user = UserModel(
            id = UUID.randomUUID(),
            name = user.name,
            username = user.username,
            password = encryptedPassword
        )
        return UserMapper.INSTANCE.userModelFromUserEntity(
            userRepository.save(
                UserMapper.INSTANCE.userModelToUserEntity(
                    user
                )
            )
        )
    }
}
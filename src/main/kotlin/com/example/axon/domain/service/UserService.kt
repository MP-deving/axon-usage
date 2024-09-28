package com.example.axon.domain.service

import com.example.axon.domain.models.UserModel
import com.example.axon.infrastructure.entities.UserEntity
import com.example.axon.infrastructure.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    fun create(user: UserModel): UserEntity {
        val encryptedPassword = passwordEncoder.encode(user.password)
        val user = UserEntity(
            id = UUID.randomUUID(),
            name = user.name,
            username = user.username,
            password = encryptedPassword)
        return userRepository.save(user)
    }
}
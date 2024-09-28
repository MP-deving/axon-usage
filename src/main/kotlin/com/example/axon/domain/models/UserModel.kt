package com.example.axon.domain.models

import com.example.axon.infrastructure.entities.AnimeEntity
import java.util.*

data class UserModel (
    val id: UUID?,
    val name: String,
    val username: String,
    val password: String,
    val favoriteAnimes: MutableSet<AnimeEntity> = mutableSetOf()
    )
package com.example.axon.infrastructure.repository

import com.example.axon.infrastructure.entities.AnimeEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AnimesRepository : JpaRepository<AnimeEntity, UUID> {
    fun findByName(name: String): AnimeEntity?
}
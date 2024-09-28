package com.example.axon.infrastructure.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "animes")
data class AnimeEntity(
    @Id
    @Column(columnDefinition = "UUID")
    val id: UUID,

    @Column(nullable = false, length = 100)
    val name: String,

    @Column(nullable = false, length = 100)
    val genre: String,

    @Column(nullable = false)
    val episodes: Int
)

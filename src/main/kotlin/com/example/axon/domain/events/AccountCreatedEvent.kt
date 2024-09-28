package com.example.axon.domain.events

data class AccountCreatedEvent(
    val accountId: String,
    val initialBalance: Double
)

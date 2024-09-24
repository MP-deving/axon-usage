package com.example.axon.events

data class AccountCreatedEvent(
    val accountId: String,
    val initialBalance: Double
)

package com.example.axon.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class CreateAccountCommand(
    @TargetAggregateIdentifier
    val accountId: String,
    val initialBalance: Double
)

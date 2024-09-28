package com.example.axon.application.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class CreateAccountCommand(
    @TargetAggregateIdentifier
    val accountId: String,
    val initialBalance: Double
)

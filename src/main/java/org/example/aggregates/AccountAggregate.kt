package com.example.axon.aggregates

import com.example.axon.commands.CreateAccountCommand
import com.example.axon.events.AccountCreatedEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
class AccountAggregate {

    @AggregateIdentifier
    private lateinit var accountId: String
    private var balance: Double = 0.0

    constructor()

    @CommandHandler
    constructor(command: CreateAccountCommand) {
        require(command.initialBalance >= 0) { "Saldo inicial não pode ser negativo" }
        AggregateLifecycle.apply(AccountCreatedEvent(command.accountId, command.initialBalance))
    }

    @EventSourcingHandler
    fun on(event: AccountCreatedEvent) {
        accountId = event.accountId
        balance = event.initialBalance
    }
}

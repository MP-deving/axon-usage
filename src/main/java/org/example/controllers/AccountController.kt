package com.example.axon.controllers

import com.example.axon.commands.CreateAccountCommand
import org.axonframework.commandhandling.gateway.CommandGateway
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/accounts")
class AccountController(
    private val commandGateway: CommandGateway
) {
    @PostMapping
    fun createAccount(@RequestBody request: CreateAccountRequest): ResponseEntity<String> {
        val accountId = UUID.randomUUID().toString()
        commandGateway.send<Void>(CreateAccountCommand(accountId, request.initialBalance))
        return ResponseEntity.ok(accountId)
    }

    data class CreateAccountRequest(val initialBalance: Double)
}

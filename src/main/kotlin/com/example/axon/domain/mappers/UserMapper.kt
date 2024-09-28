package com.example.axon.domain.mappers

import com.example.axon.domain.models.UserModel
import com.example.axon.infrastructure.entities.UserEntity
import org.mapstruct.Mapper
import org.mapstruct.Mappings
import org.mapstruct.factory.Mappers

@Mapper
interface UserMapper {

    companion object{
        val INSTANCE = Mappers.getMapper(UserMapper::class.java)
    }

    @Mappings()
    fun userModelToUserEntity(userModel: UserModel): UserEntity

    @Mappings()
    fun userModelFromUserEntity(userEntity: UserEntity): UserModel
}
package dev.awd.auth.data.remote

import dev.awd.auth.data.responses.UserResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthClient {
    @POST("auth/login")
    suspend fun login(@Body userRequest: UserRequest): UserResponse

    @POST("users/add")
    suspend fun register(@Body userRequest: UserRequest): UserResponse

    @POST("http/200")
    suspend fun logOut()

}
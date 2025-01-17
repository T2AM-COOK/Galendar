package com.example.galendar.remote

data class SignupRequest(
    val name: String,
    val email: String,
    val password: String
)

data class LoginRequest(
    val email: String,
    val password: String,
    val fcmToken: String
)

data class VerifyRequest(
    val email: String,
    val code: String
)
data class SendEmailRequest(
    val email: String
)
data class contsetRequest (
    val page: Int,
    val size: Int,
    val keyword : String
)
data class RefreshRequest(val refreshToken: String)
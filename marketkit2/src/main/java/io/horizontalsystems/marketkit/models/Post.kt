package io.horizontalsystems.marketkit2.models

data class Post(
    val source: String,
    val title: String,
    val body: String,
    val timestamp: Long,
    val url: String,
)

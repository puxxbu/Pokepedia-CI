package com.puxxbu.core.domain.model

data class Pokemon(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val isFavorite: Boolean,
    val isSearched: Boolean
)
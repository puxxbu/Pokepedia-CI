package com.puxxbu.pokepedia.di

import com.puxxbu.core.domain.usecase.PokemonUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FavoriteModuleDependencies {
    fun pokemonUseCase(): PokemonUseCase
}
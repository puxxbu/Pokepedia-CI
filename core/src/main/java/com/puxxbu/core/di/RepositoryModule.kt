package com.puxxbu.core.di

import com.puxxbu.core.data.PokemonRepository
import com.puxxbu.core.domain.repository.IPokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(pokemonRepository: PokemonRepository): IPokemonRepository
}
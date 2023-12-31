package com.puxxbu.pokepedia.presentation.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.puxxbu.core.domain.model.Pokemon
import com.puxxbu.core.domain.usecase.PokemonUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val pokemonUseCase: PokemonUseCase) :
    ViewModel() {
    fun setFavoritePokemon(pokemon: Pokemon, isFavorite: Boolean) =
        pokemonUseCase.setFavoritePokemon(pokemon, isFavorite)

    fun getPokemonDetailByName(name: String) =
        pokemonUseCase.getPokemonDetailByName(name).asLiveData()
}
package com.puxxbu.pokepedia.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.puxxbu.core.domain.usecase.PokemonUseCase
import javax.inject.Inject

class FavoriteViewModel @Inject constructor(pokemonUseCase: PokemonUseCase) : ViewModel() {
    val favoritePokemon = pokemonUseCase.getFavoritePokemon().asLiveData()
}
package com.puxxbu.pokepedia.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.puxxbu.core.domain.usecase.PokemonUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(pokemonUseCase: PokemonUseCase) :
    ViewModel() {
    val pokemon = pokemonUseCase.getAllPokemon().asLiveData()
}
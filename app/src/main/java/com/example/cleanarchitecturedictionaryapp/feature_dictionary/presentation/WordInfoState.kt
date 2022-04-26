package com.example.cleanarchitecturedictionaryapp.feature_dictionary.presentation

import com.example.cleanarchitecturedictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)

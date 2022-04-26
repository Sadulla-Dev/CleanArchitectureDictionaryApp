package com.example.cleanarchitecturedictionaryapp.feature_dictionary.domain.repository

import com.example.cleanarchitecturedictionaryapp.core.utils.Resource
import com.example.cleanarchitecturedictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}

package com.example.database

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ActivityViewModel: ViewModel() {

    private val _textFieldState = mutableStateOf(TextFieldState())
    val textFieldState: State<TextFieldState> = _textFieldState

}
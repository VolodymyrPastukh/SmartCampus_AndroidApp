package com.vovan.diplomaapp.presentation.ledController

sealed class LedControllerViewState {
    object Connecting: LedControllerViewState()
    object Connected: LedControllerViewState()

    data class Data(val data: List<Boolean>): LedControllerViewState()

    data class Error(val message: String): LedControllerViewState()
}
package com.example.captureimagewithjetpackcompose

import android.net.Uri
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _capturedImageUris = mutableStateOf<List<Uri>>(emptyList())
    val capturedImageUris: State<List<Uri>> = _capturedImageUris

    fun addCapturedImage(uri: Uri) {
        _capturedImageUris.value += listOf(uri)
    }

}
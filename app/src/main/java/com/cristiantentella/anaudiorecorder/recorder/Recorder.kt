package com.cristiantentella.anaudiorecorder.recorder

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.io.File

@Composable
fun Recorder(onNavigateToRecordings: () -> Unit, recordingsDir: File) {
    Text(text = "Recorder")
}
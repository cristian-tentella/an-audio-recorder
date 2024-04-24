package com.cristiantentella.anaudiorecorder.recordings

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.io.File

@Composable
fun Recordings(onNavigateToRecorder: () -> Unit, recordingsDir: File) {
    Text(text = "Recordings")
}
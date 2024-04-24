package com.cristiantentella.anaudiorecorder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cristiantentella.anaudiorecorder.ui.theme.AnAudioRecorderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnAudioRecorderTheme {}
        }
    }
}

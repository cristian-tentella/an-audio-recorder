package com.cristiantentella.anaudiorecorder

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cristiantentella.anaudiorecorder.recorder.Recorder
import com.cristiantentella.anaudiorecorder.recordings.Recordings

@Composable
fun App() {
    val recordingsDirName = "recordings"
    val recordingsDir = LocalContext.current.getDir(recordingsDirName, Context.MODE_PRIVATE).also {
        if (!it.exists()) {
            it.mkdirs()
        }
    }

    val navController = rememberNavController()

    val routes = object {
        val recorder = "recorder"
        val recordings = "recordings"
    }

    NavHost(navController = navController, startDestination = routes.recorder) {
        composable(route = routes.recorder) {
            Recorder(
                onNavigateToRecordings = { navController.navigate(routes.recordings) },
                recordingsDir
            )
        }

        composable(route = routes.recordings) {
            Recordings(
                onNavigateToRecorder = { navController.navigate(routes.recorder) },
                recordingsDir
            )
        }
    }
}
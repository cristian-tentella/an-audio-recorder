package com.cristiantentella.anaudiorecorder

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cristiantentella.anaudiorecorder.recorder.Recorder
import com.cristiantentella.anaudiorecorder.recordings.Recordings

@Composable
fun App() {
    val navController = rememberNavController()

    val recorderRoute = "recorder"
    val recordingsRoute = "recordings"

    NavHost(navController = navController, startDestination = recorderRoute) {
        composable(route = recorderRoute) {
            Recorder(onNavigateToRecordings = { navController.navigate(recordingsRoute) })
        }

        composable(route = recordingsRoute) {
            Recordings(onNavigateToRecorder = { navController.navigate(recorderRoute) })
        }
    }
}
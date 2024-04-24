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

    val routes = object {
        val recorder = "recorder"
        val recordings = "recordings"
    }

    NavHost(navController = navController, startDestination = routes.recorder) {
        composable(route = routes.recorder) {
            Recorder(onNavigateToRecordings = { navController.navigate(routes.recordings) })
        }

        composable(route = routes.recordings) {
            Recordings(onNavigateToRecorder = { navController.navigate(routes.recorder) })
        }
    }
}
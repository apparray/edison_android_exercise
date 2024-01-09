package jp.speakbuddy.edisonandroidexercise.infrastructure.presenter.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import jp.speakbuddy.edisonandroidexercise.infrastructure.presenter.composable.fact.FactScreen
import jp.speakbuddy.edisonandroidexercise.infrastructure.presenter.viewmodels.fact.FactViewModel
import jp.speakbuddy.edisonandroidexercise.infrastructure.utils.theme.EdisonAndroidExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EdisonAndroidExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FactScreen(viewModel = FactViewModel())
                }
            }
        }
    }
}
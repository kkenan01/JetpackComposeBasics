package com.kenankaric.jetpackcomposebasics.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.kenankaric.jetpackcomposebasics.R
import com.kenankaric.jetpackcomposebasics.router.BackButtonHandler
import com.kenankaric.jetpackcomposebasics.router.ComposeBasicsRouter
import com.kenankaric.jetpackcomposebasics.router.Screen

@Composable
fun ProgressIndicatorScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            color = colorResource(id = R.color.purple_500),
            strokeWidth = 5.dp
        )
        Spacer(modifier = Modifier.height(8.dp))
        LinearProgressIndicator(progress = 0.5f)
    }

    BackButtonHandler {
        ComposeBasicsRouter.navigateTo(Screen.Navigation)
    }
}
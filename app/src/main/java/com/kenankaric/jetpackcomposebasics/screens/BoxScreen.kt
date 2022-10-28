package com.kenankaric.jetpackcomposebasics.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.kenankaric.jetpackcomposebasics.R
import com.kenankaric.jetpackcomposebasics.router.BackButtonHandler
import com.kenankaric.jetpackcomposebasics.router.ComposeBasicsRouter
import com.kenankaric.jetpackcomposebasics.router.Screen

@Composable
fun BoxScreen() {
    MyBox()

    BackButtonHandler {
        ComposeBasicsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyBox(
    modifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier,
) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.first),
            fontSize = 22.sp,
            modifier = contentModifier.align(Alignment.TopStart)
        )

        Text(
            text = stringResource(id = R.string.second),
            fontSize = 22.sp,
            modifier = contentModifier.align(Alignment.Center)
        )

        Text(
            text = stringResource(id = R.string.third),
            fontSize = 22.sp,
            modifier = contentModifier.align(Alignment.BottomEnd)
        )
    }
}
package com.kenankaric.jetpackcomposebasics.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
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

val THREE_ELEMENT_LIST = listOf(R.string.first, R.string.second, R.string.third)

@Composable
fun RowScreen() {
    MyRow()

    BackButtonHandler {
        ComposeBasicsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {

        THREE_ELEMENT_LIST.forEach { textResId ->
            Text(
                text = stringResource(id = textResId),
                fontSize = 18.sp
            )
        }
    }
}
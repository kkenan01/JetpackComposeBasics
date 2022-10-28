package com.kenankaric.jetpackcomposebasics.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kenankaric.jetpackcomposebasics.R
import com.kenankaric.jetpackcomposebasics.router.BackButtonHandler
import com.kenankaric.jetpackcomposebasics.router.ComposeBasicsRouter
import com.kenankaric.jetpackcomposebasics.router.Screen

private val items = listOf(
    SectionCategory(
        R.string.section1,
        listOf(
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3
        )
    ),
    SectionCategory(
        R.string.section2,
        listOf(
            R.drawable.img_3,
            R.drawable.img_1,
        )
    ),
    SectionCategory(
        R.string.section3,
        listOf(
            R.drawable.img_3,
            R.drawable.img_1,
            R.drawable.img_3
        )
    ),
    SectionCategory(
        R.string.section4,
        listOf(
            R.drawable.img_1,
            R.drawable.img_3
        )
    )
)

@Composable
fun ListScreen() {
    MyList()

    BackButtonHandler {
        ComposeBasicsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyList() {
    LazyColumn {
        items(items) { item -> ListItem(item) }
    }
}

@Composable
fun ListItem(sectionCategory: SectionCategory, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = stringResource(sectionCategory.categoryResourceId),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.purple_500)
        )
        Spacer(modifier = modifier.height(8.dp))

        LazyRow {
            items(sectionCategory.imageResources) { items ->
                SectionImage(items)
            }
        }
    }
}

@Composable
fun SectionImage(imageResource: Int) {
    Image(
        modifier = Modifier.size(170.dp, 200.dp),
        painter = painterResource(id = imageResource),
        contentScale = ContentScale.Fit,
        contentDescription = stringResource(R.string.content_description)
    )
}

data class SectionCategory(@StringRes val categoryResourceId: Int, val imageResources: List<Int>)
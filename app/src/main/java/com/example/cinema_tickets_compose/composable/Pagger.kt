package com.example.cinema_tickets_compose.composable

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets_compose.R

var image : Int? = R.drawable.img_10
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalImages(
    onClickImage: (Any?) -> Unit,
    pagerState: PagerState,
    images: List<Int>,
    modifier: Modifier = Modifier,
) {
    HorizontalPager(
        state = pagerState,
        pageCount = images.size,
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,

        modifier = modifier
    ) {
        image = images[it % images.size]


        Box(
            modifier = Modifier
                .wrapContentSize()
                .animateContentSize()
        ) {
            Image(
                painter = painterResource(id = images[it % images.size]),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(3 / 4f)
                    .clip(MaterialTheme.shapes.extraLarge)
                    .clickable { onClickImage }
            )
        }
    }
}

@Composable
fun BlureImage(){
    Image(

        painter = painterResource(image!!),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.45f)
            .background(Color.Transparent)
            .background(Color.Transparent)
            .blur(20.dp)
            .background(Color.Transparent)

    )
}


@Preview(showBackground = true)
@Composable
fun PreviewPager() {

}

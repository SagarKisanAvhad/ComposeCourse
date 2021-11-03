package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.ComposeCourseTheme
import com.google.android.material.internal.ViewUtils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // Practice()
            val painter = painterResource(id = R.drawable.abc)
            ImageCard(painter =painter,
                contentDescription ="abc" ,
                title ="Compose is awesome",
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)
            )
        }
    }

   // @Preview
    @Composable
    fun Practice() {
        Column(
            modifier = Modifier
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                //.width(600.dp)
                // .requiredWidth(600.dp)
                .background(Color.Magenta)
                .border(width = 5.dp, color = Color.Green)
                .padding(5.dp)
                .border(width = 5.dp, color = Color.Blue)
                .padding(5.dp)
                .border(width = 5.dp, color = Color.Red)
                .padding(5.dp),
            //horizontalArrangement = Arrangement.SpaceAround,
            //verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Hello", modifier = Modifier
                .clickable { })
            //.border(2.dp,Color.Black))
            //.offset(y = 20.dp))
            Spacer(modifier = Modifier.height(50.dp))
            Text("World")
        }
    }

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp,
            backgroundColor = Color.Green
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Black
                    ),
                    startY = 0f
                )))

                Text(
                    text = title,
                    style = TextStyle(color = Color.White, fontSize = 16.sp),
                    modifier = Modifier
                        .padding(12.dp)
                        .align(Alignment.BottomStart)
                )
            }
        }
    }

    @Preview
    @Composable
    fun PreviewImage(){
        val painter = painterResource(id = R.drawable.abc)
        ImageCard(painter =painter,
            contentDescription ="abc" ,
            title ="Compose is awesome",
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)
        )

    }
}

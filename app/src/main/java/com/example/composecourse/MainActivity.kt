package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice()
        }
    }

    @Preview
    @Composable
    fun Practice(){
        /*Row(
            modifier = Modifier
                //.fillMaxSize(0.5f)
                .width(300.dp)
                //.height(200.dp)
                .fillMaxHeight()
                .background(Color.Green),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("SAGAR")
            Text("KISAN")
            Text("AVHAD")
        }*/
        Column(
            modifier = Modifier
                .fillMaxHeight(0.7f)
                //.width(600.dp)
                .requiredWidth(600.dp)
                .background(Color.Blue)
        ) {
            Text("Hello")
            Text("World")
        }
    }
}

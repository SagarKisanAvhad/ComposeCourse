package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
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
    fun Practice() {
        Column(
            modifier = Modifier
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                //.width(600.dp)
                // .requiredWidth(600.dp)
                .background(Color.Magenta)
                .border(width = 5.dp,color = Color.Green)
                .padding(5.dp)
                .border(width = 5.dp,color = Color.Blue)
                .padding(5.dp)
                .border(width = 5.dp,color = Color.Red)
                .padding(5.dp),
            //horizontalArrangement = Arrangement.SpaceAround,
            //verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Hello",modifier = Modifier
                .clickable {  })
                //.border(2.dp,Color.Black))
                //.offset(y = 20.dp))
            Spacer(modifier = Modifier.height(50.dp))
            Text("World")
        }
    }
}

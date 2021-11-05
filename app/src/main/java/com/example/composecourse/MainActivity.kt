package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.ComposeCourseTheme
import com.google.android.material.internal.ViewUtils
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private val fontFamily by lazy {
        FontFamily(
            Font(R.font.ubuntu_bold, FontWeight.Bold),
            Font(R.font.ubuntu_light, FontWeight.Light),
            Font(R.font.ubuntu_medium, FontWeight.Medium),
            Font(R.font.ubuntu_regular, FontWeight.Normal)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn {
                /*
                //For Single Item
                item {
                    Text(
                        text = "Single Item",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Magenta)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }*/

                /*//this is like a for loop
                items(5000){
                    Text(
                        text = "Item $it",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Magenta)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                }*/

                //this is like for each loop
                // use when we need to convert list of data to list of item

                itemsIndexed(
                    listOf(
                        User(firstName = "Sameer", "Avhad"),
                        User(firstName = "Nitu", "Avhad"),
                        User(firstName = "Kisan", "Avhad"),
                        User(firstName = "Kusum", "Avhad"),
                        User(firstName = "Dipa", "Avhad"),
                        User(firstName = "Sagar", "Avhad"),
                    )
                ) { index: Int, user: User ->
                    Text(
                        text = "${index + 1} ${user.firstName} ${user.lastName}",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Magenta)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                }

            }
        }
    }
}

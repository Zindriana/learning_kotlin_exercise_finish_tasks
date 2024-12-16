package com.example.learn_kotlin_task_finish

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_kotlin_task_finish.ui.theme.Learn_kotlin_task_finishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Learn_kotlin_task_finishTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TopImage()
                        FirstText()
                        SecondText()
                    }
                }
            }
        }
    }
}

@Composable
fun TopImage(){
    val image = painterResource(R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = null
    )
}


@Composable
fun FirstText(modifier: Modifier = Modifier){
    Text(
        text = stringResource(R.string.text_one),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(top = 24.dp, bottom = 8.dp)
    )
}

@Composable
fun SecondText(modifier: Modifier = Modifier){
    Text(
        text = stringResource(R.string.text_two),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(16.dp)
    )
}
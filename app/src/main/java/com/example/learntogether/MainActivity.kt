package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        titre = stringResource(R.string.jetpack_compose_tutorial),
                        paragraph1 = stringResource(R.string.jetpack_compose_is_a_text),
                        paragraph2 = stringResource(R.string.Compose_text),


                        )
                }
            }
            }
        }
    }


@Composable
fun GreetingText(titre: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {

        Text(
            text = titre,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = paragraph1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp),
        )
    }
}

@Composable
fun GreetingImage(titre: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
 val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
        )
        GreetingText(
            titre = titre,
            paragraph1 = paragraph1,
            paragraph2 = paragraph2,
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        GreetingImage(
            titre = stringResource(R.string.jetpack_compose_tutorial),
            paragraph1 = stringResource(R.string.jetpack_compose_is_a_text),
            paragraph2 = stringResource(R.string.Compose_text),
        )
    }
}
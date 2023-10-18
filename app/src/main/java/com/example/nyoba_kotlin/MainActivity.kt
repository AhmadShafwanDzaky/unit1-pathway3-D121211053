package com.example.nyoba_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.nyoba_kotlin.ui.theme.NyobakotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NyobakotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Ahmad Shafwan Dzaky", "Undergraduate Informatics Engineering at Hasanuddin University", "+62290391828", "@dzakyy._", "ahmadshafwandzaky", "ahmadshafwandzaky@gmail.com")
                }
            }
        }
    }
}

@Composable
fun Greeting(fullName: String, title: String, wa: String, ig: String, dribbble: String, gmail: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 12.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.pp),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 12.dp))
        
        Text(
            text = fullName,
            modifier = modifier,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = title,
            modifier = modifier,
            fontSize = 12.sp,
            lineHeight = 12.sp,
            textAlign = TextAlign.Center
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 20.dp)){
        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.wa),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
                )
            Text(
                text = wa,
                modifier = modifier,
                fontSize = 16.sp)

        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.ig),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = ig,
                modifier = modifier,
                fontSize = 16.sp)

        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.dribbble),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = dribbble,
                modifier = modifier,
                fontSize = 16.sp)

        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Image(
                painter = painterResource(id = R.drawable.gmail),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = gmail,
                modifier = modifier,
                fontSize = 16.sp)

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NyobakotlinTheme {
        Greeting("Android", "test","wa", "ig", "dribbble", "gmail")
    }
}
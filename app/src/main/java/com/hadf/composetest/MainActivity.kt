package com.hadf.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hadf.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    // Code written down here ...
                    Column(
                        modifier = Modifier
                            .height(500.dp)
                            .width(500.dp)
                            .background(Color.LightGray),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CustomItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
                        CustomItem(weight = 1f)
                    }
                }
            }
        }
    }
}



@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(modifier = Modifier
        .width(200.dp)
        .weight(weight),
        color = color
    ) {}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        // A surface container using the 'background' color from the theme
        Column(
            modifier = Modifier
                .height(500.dp)
                .width(500.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           CustomItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
            CustomItem(weight = 1f)
        }
    }
}
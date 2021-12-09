package com.smarttoolfactory.composebadge

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.smarttoolfactory.composebadge.ui.theme.ComposeBadgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBadgeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    BadgeImplementation()
                }
            }
        }
    }
}

@Composable
fun BadgeImplementation() {
    BadgeSamples()
}

@Preview("dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(device = Devices.PIXEL_C)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBadgeTheme {
        BadgeImplementation()
    }
}
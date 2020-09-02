package com.tfandkusu.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

/**
 * @see https://developer.android.com/jetpack/compose/tutorial?hl=ja
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewGreeting()
        }
    }

    @Composable
    @Preview
    fun PreviewGreeting() {
        NewsStory()
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name !")
    }


    @Composable
    fun NewsStory() {
        // 画像リソース読込
        val image = imageResource(R.drawable.header)
        MaterialTheme {
            val typography = MaterialTheme.typography
            // 縦に並べる
            Column(modifier = Modifier.padding(16.dp)/*レイアウトの設定*/) {
                // 横幅合わせ、縦幅180dp
                val imageModifier = Modifier.preferredHeight(180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp))
                Image(
                    image, modifier = imageModifier,
                    contentScale = ContentScale.Crop /* 表示領域すべてを埋める */
                )
                Spacer(Modifier.preferredSize(16.dp))
                Text(
                    "A day wandering through the sandhills " +
                            "in Shark Fin Cove, and a few of the " +
                            "sights I saw", style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis /* 2行で切る */
                )
                Text("Davenport, California", style = typography.body2)
                Text("December 2018", style = typography.body2)
            }
        }
    }
}

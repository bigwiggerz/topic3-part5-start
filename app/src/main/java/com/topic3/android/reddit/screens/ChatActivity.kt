package com.topic3.android.reddit.screens

import android.os.Bundle
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import android.widget.Toast
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import java.util.Locale
import com.topic3.android.reddit.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.backButton.setOnClickListener {
            finish()
        }

        binding.composeButton.setOnClickListener {
            showToast()
        }
    }


        private fun showToast() {
            Toast.makeText(this, "Imaginary chat started!", Toast.LENGTH_SHORT).show()
        }
    }

    @Composable
    private fun ComposableButton(onButtonClick: () -> Unit) {
        val buttonColors = buttonColors(
            backgroundColor = Color(0xFF006837),
            contentColor = Color.White
        )

        Button(
            onClick = onButtonClick, elevation = null,
            shape = RoundedCornerShape(corner = CornerSize(24.dp)),
            contentPadding = PaddingValues(start = 32.dp, end = 32.dp),
            colors = buttonColors,
            modifier = Modifier.height(48.dp)
        ) {
            Text(
                text = "Start chatting".toUpperCase(Locale.US),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }

    @Preview
    @Composable
    private fun ComposeButtonPreview() {
        ComposableButton {
        }
    }

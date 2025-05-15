package com.example.kata

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.kata.presentation.ui.token.KataTheme
import org.junit.Rule
import org.junit.Test

class AcceptanceTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    @JvmName("fn0")
    fun `When the App is started then Hello World is shown`() {
        composeTestRule.setContent {
            KataTheme {
                MainScreen()
            }
        }

        composeTestRule.onNodeWithText("Hello World").assertIsDisplayed()
    }
}
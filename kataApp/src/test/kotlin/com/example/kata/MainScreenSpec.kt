package com.example.kata

import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.simplegallery.presentation.ui.RoborazziTest
import com.example.simplegallery.presentation.ui.TestApplication
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [33], application = TestApplication::class)
class MainScreenSpec : RoborazziTest() {
    @Before
    fun setUp() {
        subjectUnderTest.setContent {
            MainScreen()
        }
    }

    @Test
    fun `It renders Hello World`() {
        subjectUnderTest.onNodeWithText("Hello World").isDisplayed()
    }
}
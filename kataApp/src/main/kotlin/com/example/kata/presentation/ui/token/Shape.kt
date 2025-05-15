/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package com.example.kata.presentation.ui.token

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

object Shape {
    object CornerRadius {
        val none = 0.dp
        val subtle = 6.dp
        val moderate = 8.dp
        val standard = 12.dp
        val strong = 16.dp
        val extreme = 24.dp
        val maximum = Int.MAX_VALUE.dp
    }

    val cornerRadius = com.example.kata.presentation.ui.token.Shape.CornerRadius

    val standardRoundedCorner = RoundedCornerShape(12.dp)
}

package org.ywmmmw.mytodo.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import org.ywmmmw.mytodo.R


@Composable
fun Header() {
    Text(
        stringResource(R.string.main_title),
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(20.dp)
    )
}
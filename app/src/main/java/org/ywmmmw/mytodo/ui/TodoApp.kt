package org.ywmmmw.mytodo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.ywmmmw.mytodo.data.Datasource
import org.ywmmmw.mytodo.ui.components.Header
import org.ywmmmw.mytodo.ui.components.TodoList
import org.ywmmmw.mytodo.ui.theme.MyTodoTheme


@Preview(showBackground = true)
@Composable
fun TodoApp(
    modifier: Modifier = Modifier
) {
    val layoutDirection = LocalLayoutDirection.current
    MyTodoTheme {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(
                    start = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateStartPadding(layoutDirection) + 10.dp,
                    end = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateEndPadding(layoutDirection) + 10.dp)
        ) {
            Header()
            TodoList(Datasource().loadTodos(), modifier = modifier)
        }
    }
}
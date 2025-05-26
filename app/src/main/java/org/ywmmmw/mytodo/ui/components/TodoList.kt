package org.ywmmmw.mytodo.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import org.ywmmmw.mytodo.model.Todo
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodoList(todoList: List<Todo>, modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = modifier
    ) {
        items(todoList) { todo: Todo ->
            TodoCard(todo, modifier = modifier)
        }
    }
}
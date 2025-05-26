package org.ywmmmw.mytodo.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import org.ywmmmw.mytodo.model.Todo
import org.ywmmmw.mytodo.ui.theme.Typography
import org.ywmmmw.mytodo.ui.theme.BackgroundWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoCard(todo: Todo, modifier: Modifier) {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .height(50.dp)
            .background(BackgroundWhite)
            .padding(
                horizontal = 50.dp,
                vertical = 5.dp
            )
            .pointerInput(Unit) {
                detectTapGestures(
                    onLongPress = { offset: Offset ->
                        Log.d("MyTodoTest", "触发长按操作")
                    }
                )
            }
    ) {
        Text(
            text = todo.shortText,
//                fontSize = 20.sp,
            style = Typography.bodyLarge,
        )
        Spacer(modifier = Modifier.width(20.dp).weight(1f))
        NotifyTip(
            todo = todo,
            modifier = modifier
        )
    }
}
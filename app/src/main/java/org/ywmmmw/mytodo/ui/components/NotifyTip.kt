package org.ywmmmw.mytodo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.ywmmmw.mytodo.model.Todo
import org.ywmmmw.mytodo.ui.theme.BackgroundWhite
import org.ywmmmw.mytodo.ui.theme.PurpleGrey80
import org.ywmmmw.mytodo.ui.theme.Typography

@Composable
fun NotifyTip(todo: Todo, modifier: Modifier) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Icon(
            imageVector = Icons.Outlined.Notifications,
            contentDescription = "提醒时间",
            tint = PurpleGrey80,
            modifier = Modifier.size(14.dp)
        )
        Text(
            text = todo.shortText,
            style = Typography.labelSmall,
            color = PurpleGrey80
        )
    }
}
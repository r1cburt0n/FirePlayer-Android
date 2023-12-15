package com.coolnexttech.fireplayer.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.coolnexttech.fireplayer.R
import com.coolnexttech.fireplayer.ui.theme.AppColors

@Composable
fun ListItemText(
    text: String,
    endActionIconId: Int = R.drawable.ic_more,
    color: Color = AppColors.textColor,
    action: () -> Unit,
    moreAction: () -> Unit
) {
    Row(Modifier.clickable { action() }) {
        Text(
            text = text,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .padding(all = 8.dp),
            color = color
        )

        Spacer(modifier = Modifier.weight(1f))

        ActionIconButton(endActionIconId) {
            moreAction()
        }
    }

    Divider()
}

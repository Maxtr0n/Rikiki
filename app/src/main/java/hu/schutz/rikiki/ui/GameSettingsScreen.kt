package hu.schutz.rikiki.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import hu.schutz.rikiki.R

@Composable
fun GameSettingsScreen(
    onStartGameClicked: () -> Unit
) {
    GameSettingsContent(
        startGameClicked = onStartGameClicked
    )
}

@Composable
fun GameSettingsContent(
    startGameClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(R.string.game_settings),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(16.dp)
        )
        Button(
            onClick = { startGameClicked() },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = stringResource(R.string.new_game))
        }
    }
}
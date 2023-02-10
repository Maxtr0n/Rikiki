package hu.schutz.rikiki.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import hu.schutz.rikiki.R
import hu.schutz.rikiki.ui.theme.RikikiTheme

@Composable
fun MainMenuScreen(
    onNewGameClicked: () -> Unit,
) {
    MainMenuContent(
        newGameClicked = onNewGameClicked
    )
}

@Composable
fun MainMenuContent(
    newGameClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.main_menu_title),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(16.dp)
        )
        Button(
            onClick = { newGameClicked() },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = stringResource(R.string.new_game))
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainMenuContentPreview() {
    RikikiTheme {
        MainMenuContent(
            newGameClicked = { }
        )
    }
}
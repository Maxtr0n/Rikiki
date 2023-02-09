package hu.schutz.rikiki

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import hu.schutz.rikiki.RikikiDestinations.GAME_ROUTE
import hu.schutz.rikiki.RikikiDestinations.GAME_SETTINGS_ROUTE
import hu.schutz.rikiki.RikikiDestinations.MAIN_MENU_ROUTE
import hu.schutz.rikiki.ui.GameScreen
import hu.schutz.rikiki.ui.GameSettingsScreen
import hu.schutz.rikiki.ui.MainMenuScreen

@Composable
fun RikikiNavHost(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
    navigationActions: RikikiNavigationActions = remember(navHostController) {
        RikikiNavigationActions(navHostController)
    }
) {
    NavHost(
        navController = navHostController,
        startDestination = MAIN_MENU_ROUTE,
        modifier = modifier
    ) {
        composable(
            route = MAIN_MENU_ROUTE
        ) {
            MainMenuScreen(
                onNewGameClicked = { navigationActions.navigateToGameSettingsScreen() }
            )
        }
        composable(
            route = GAME_ROUTE
        ) {
            GameScreen()
        }
        composable(
            route = GAME_SETTINGS_ROUTE
        ) {
            GameSettingsScreen(
                onStartGameClicked = { navigationActions.navigateToGameScreen() }
            )
        }
    }
}
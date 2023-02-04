package hu.schutz.rikiki

import androidx.navigation.NavController
import hu.schutz.rikiki.Screens.GAME_SCREEN
import hu.schutz.rikiki.Screens.GAME_SETTINGS_SCREEN
import hu.schutz.rikiki.Screens.MAIN_MENU_SCREEN

private object Screens {
    const val MAIN_MENU_SCREEN = "main_menu"
    const val GAME_SCREEN = "game"
    const val GAME_SETTINGS_SCREEN = "game_settings"
}

object RikikiNavigationArgs {

}

object RikikiDestinations {
    const val MAIN_MENU_ROUTE = MAIN_MENU_SCREEN
    const val GAME_ROUTE = GAME_SCREEN
    const val GAME_SETTINGS_ROUTE = GAME_SETTINGS_SCREEN
}

class RikikiNavigationActions(private val navController: NavController) {
    fun navigateToGameSettingsScreen() {
        navController.navigate(GAME_SETTINGS_SCREEN) {
            launchSingleTop = true
        }
    }

    fun navigateToGameScreen() {
        navController.navigate(GAME_SCREEN) {
            launchSingleTop = true
        }
    }

    fun navigateToMainMenuScreen() {
        navController.navigate(MAIN_MENU_SCREEN) {
            launchSingleTop = true
        }
    }
}
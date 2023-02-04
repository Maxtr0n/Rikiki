package hu.schutz.rikiki

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import hu.schutz.rikiki.RikikiDestinations.MAIN_MENU_ROUTE

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

    }
}
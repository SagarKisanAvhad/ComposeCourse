package com.example.composecourse.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composecourse.Screen

@Composable
fun Navigation(){
    //navController
    val navController = rememberNavController()
    //navHost
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ){
        composable(Screen.SplashScreen.route){

        }

        composable(Screen.MainScreen.route){

        }

        composable(Screen.DetailScreen.route){

        }
    }
        //composable
}
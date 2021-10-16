package com.example.android.gymondoautomationtest.pages

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.android.gymondoautomationtest.model.ValidLoginCredentials.PASSWORD
import com.example.android.gymondoautomationtest.model.ValidLoginCredentials.USERNAME
import com.example.android.gymondoautomationtest.locators.LoginPage.userNameField
import com.example.android.gymondoautomationtest.locators.LoginPage.passwordField
import com.example.android.gymondoautomationtest.locators.LoginPage.loginBtn
import com.example.android.gymondoautomationtest.locators.SearchPage.searchBtn

class LoginPage {

    fun login (){
        fillLoginCredentials(USERNAME,PASSWORD)
        clickLoginBtn()
    }

    private fun fillLoginCredentials (username: String, password: String) {
        onView(userNameField)
            .check(matches(isDisplayed()))
            .perform(typeText(username))
        onView(passwordField)
            .check(matches(isDisplayed()))
            .perform(typeText(password))
    }

    private fun clickLoginBtn() {
        closeSoftKeyboard()
        onView(loginBtn)
            .perform(click())
    }

    fun verifyUserIsLoggedIn(){
        onView(searchBtn)
            .check(matches(isDisplayed()))
    }

}
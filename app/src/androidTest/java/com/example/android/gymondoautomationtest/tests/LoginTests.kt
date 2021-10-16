package com.example.android.gymondoautomationtest.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTests : BaseTests() {

    @Test
    fun testUserCanLoginSuccessfully() {
        loginPage.login()
        loginPage.verifyUserIsLoggedIn()
    }
}
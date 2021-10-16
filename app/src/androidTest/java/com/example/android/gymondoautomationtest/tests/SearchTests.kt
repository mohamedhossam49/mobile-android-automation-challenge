package com.example.android.gymondoautomationtest.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SearchTests : BaseTests () {

    @Test
    fun testUserCanSearchByItemId() {
        loginPage.login()
        searchPage.searchForAnItemById()
        searchPage.verifyItemIsDisplayed()
    }
}




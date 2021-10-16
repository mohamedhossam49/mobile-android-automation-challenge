package com.example.android.gymondoautomationtest.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ImageTests : BaseTests() {

    @Test
    fun testUserCanViewItemImage(){
        loginPage.login()
        searchPage.searchForAnItemByKeyword()
        searchPage.openImageView()
        imagePage.verifyImageIsDisplayed()
    }
}


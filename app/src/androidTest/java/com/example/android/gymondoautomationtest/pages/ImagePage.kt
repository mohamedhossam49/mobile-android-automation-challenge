package com.example.android.gymondoautomationtest.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.android.gymondoautomationtest.locators.ImagePage.itemNameField
import com.example.android.gymondoautomationtest.locators.ImagePage.itemImageField
import com.example.android.gymondoautomationtest.model.itemName

class ImagePage {

    fun verifyImageIsDisplayed () {
        onView(itemNameField)
            .check(matches(withText(itemName)))
        onView(itemImageField)
            .check(matches(isDisplayed()))
    }

}
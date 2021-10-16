package com.example.android.gymondoautomationtest.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.android.gymondoautomationtest.locators.SearchPage.searchInputField
import com.example.android.gymondoautomationtest.locators.SearchPage.searchBtn
import com.example.android.gymondoautomationtest.locators.SearchPage.recyclerView
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import com.example.android.gymondoautomationtest.model.itemName
import com.example.android.gymondoautomationtest.model.keyword
import kotlinx.android.synthetic.main.layout_item.view.*

class SearchPage {

    fun searchForAnItemById () {
        onView(searchInputField)
            .check(matches(isDisplayed()))
            .perform(typeText(keyword))
        closeSoftKeyboard()
        onView(searchBtn)
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun verifyItemIsDisplayed () {
        onView(withText(itemName))
            .check(matches(isDisplayed()))
    }

    fun openImageView () {
        onView(recyclerView)
            .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
    }

}

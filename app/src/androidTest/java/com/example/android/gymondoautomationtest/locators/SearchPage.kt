package com.example.android.gymondoautomationtest.locators

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.gymondoautomationtest.R
import org.hamcrest.Matcher

object SearchPage {
    val searchInputField: Matcher<View> = withId(R.id.editTxtSearch)
    val searchBtn: Matcher<View> = withId(R.id.btnSearch)
    val recyclerView: Matcher<View> = withId(R.id.recycler_view)
}
package com.example.android.gymondoautomationtest.locators

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.android.gymondoautomationtest.R
import org.hamcrest.Matcher

object ImagePage {
    val itemNameField: Matcher<View> = withId(R.id.item_text)
    val itemImageField: Matcher<View> = withId(R.id.appCompatImageView)
}
package com.example.android.gymondoautomationtest.locators

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.gymondoautomationtest.R
import org.hamcrest.Matcher

object LoginPage {
    val userNameField: Matcher<View> = withId(R.id.editText)
    val passwordField: Matcher<View> = withId(R.id.editText2)
    val loginBtn: Matcher<View> = withId(R.id.button)
}
package com.example.android.gymondoautomationtest.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.android.gymondoautomationtest.MainActivity
import com.example.android.gymondoautomationtest.pages.ImagePage
import com.example.android.gymondoautomationtest.pages.LoginPage
import com.example.android.gymondoautomationtest.pages.SearchPage
import org.junit.Rule

open class BaseTests {
    val loginPage = LoginPage()
    val searchPage = SearchPage()
    val imagePage = ImagePage()
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)
}
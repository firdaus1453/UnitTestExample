package com.github.instrumenttestexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Muhammad Firdaus on 06/01/2020.
 */
class MainActivityTest{

    @Test
    fun greeterSaysHello() {
        onView(withId(R.id.name_field))
            .perform(typeText("Steve"))
            .check(matches(isDisplayed()))
    }
}
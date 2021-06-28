package com.example.loginapp.ui.login;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.loginapp.R;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ChangeTestBehaviorTest {
    @Rule
    public ActivityTestRule<LoginActivity> mActivity = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void changeTest_sameActivity() {
        //id/username
        //id/password
        //id/login

        onView(withId(R.id.username)).perform(typeText("hello"));
        onView(withId(R.id.password)).perform(typeText("password"));

        closeSoftKeyboard();

        onView(withId(R.id.login)).perform(click());
    }
}

package com.example.uiapplication;


import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.Test;
public class testde {

    @Test
    public void testDemo() throws UiObjectNotFoundException {
        UiDevice instance = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        //找到APP
        UiObject app = new UiObject(new UiSelector().description("UI Application"));
        app.click();
        //找到用户名框
        UiObject email = new UiObject(new UiSelector().resourceId("com.example.uiapplication:id/username_edit"));
        email.setText("123");
        //找到密码框
        UiObject pass = new UiObject(new UiSelector().resourceId("com.example.uiapplication:id/password_edit"));
        pass.setText("123");
        //找到登陆按钮
        UiObject login = new UiObject(new UiSelector().resourceId("com.example.uiapplication:id/login"));
        login.click();

        //instance.pressHome();
    }
}
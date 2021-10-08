package com.vytrack.tests;

import com.vytrack.pages.MenuBar;
import com.vytrack.pages.VyTrackLogin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class userStory_1 {
    /*
    1. Story: As a user, I should be access all the main modules of the app.
    */
    private MenuBar menuBar = new MenuBar();
    private VyTrackLogin login = new VyTrackLogin();

    /* AC #1:
     Given store/sales manager is on the homePage
     Then verify user view 8 models names [verify the names]
      */
    @Test
    public void testModuleNamesForManager() {
    login.goTo();
    login.loginAsSalesManager();
    List<String> expected = new ArrayList<>(Arrays.asList("Dashboards","Fleet","Customers","Sales","Activities","Marketing","Reports & Segments","System"));
    assertTrue(menuBar.moduleNamesMatch(expected));
    }


    /*
    AC #2:
    Given driver is on the homePage
    Then verify user view 4 models names [verify the names]
     */
}

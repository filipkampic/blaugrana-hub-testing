package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void applicationLoads() {
        String title = driver.getTitle();
        Assert.assertNotNull(title, "Page title should not be null");
    }
}

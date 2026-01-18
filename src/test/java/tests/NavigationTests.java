package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationPage;

public class NavigationTests extends BaseTest {

    @Test
    public void navigationMenuIsVisible() {
        NavigationPage navigationPage = new NavigationPage(driver);
        Assert.assertTrue(
                navigationPage.isNavigationDisplayed(),
                "Navigation menu should be visible"
        );
    }

    @Test
    public void navigateToAboutPage() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickAbout();
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("about"));
    }

    @Test
    public void navigateToStadiumPage() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickStadium();
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("stadium"));
    }

    @Test
    public void navigateToGalleryPage() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickGallery();
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("gallery"));
    }

    @Test
    public void navigateToAcademyPage() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickAcademy();
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("academy"));
    }

    @Test
    public void navigateToLegendsPage() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickLegends();
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("legends"));
    }
}

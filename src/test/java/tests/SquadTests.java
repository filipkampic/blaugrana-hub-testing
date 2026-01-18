package tests;

import base.BaseTest;
import pages.SquadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquadTests extends BaseTest {

    @Test
    public void squadSectionIsVisible() {
        SquadPage squadPage = new SquadPage(driver);

        Assert.assertTrue(
                squadPage.isSquadSectionDisplayed(),
                "Squad section should be visible on home screen"
        );
    }

    @Test
    public void squadContainsPlayers() {
        SquadPage squadPage = new SquadPage(driver);

        Assert.assertTrue(
                squadPage.getNumberOfPlayers() > 0,
                "Squad should contain at least one player"
        );
    }

    @Test
    public void clickOnPlayerOpensPlayerDetails() {
        SquadPage squadPage = new SquadPage(driver);
        squadPage.clickFirstPlayer();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("player="),
                "Clicking on a player should open player details page"
        );
    }
}
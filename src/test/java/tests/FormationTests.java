package tests;

import base.BaseTest;
import pages.FormationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormationTests extends BaseTest {

    @Test
    public void formationDropdownChangesFormation() {
        FormationPage formationPage = new FormationPage(driver);

        formationPage.selectFormation("4-3-3");

        Assert.assertEquals(
                formationPage.getNumberOfPositions(),
                11,
                "Formation should contain 11 positions"
        );
    }

    @Test
    public void allFormationPositionsHaveDataPositionAttribute() {
        FormationPage formationPage = new FormationPage(driver);

        Assert.assertTrue(
                formationPage.allPositionsHaveDataAttribute(),
                "All formation positions must have data-position attribute"
        );
    }
}

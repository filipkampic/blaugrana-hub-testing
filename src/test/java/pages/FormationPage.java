package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class FormationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public FormationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By formationDropdown = By.id("formation-select");
    private By formationPositions = By.cssSelector("#formation-display .player");

    public void selectFormation(String formation) {
        WebElement dropdown = wait.until(
                ExpectedConditions.elementToBeClickable(formationDropdown)
        );
        Select select = new Select(dropdown);
        select.selectByVisibleText(formation);
    }

    public int getNumberOfPositions() {
        List<WebElement> positions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(formationPositions)
        );
        return positions.size();
    }

    public boolean allPositionsHaveDataAttribute() {
        for (WebElement pos : driver.findElements(formationPositions)) {
            if (pos.getAttribute("data-position") == null) {
                return false;
            }
        }
        return true;
    }
}

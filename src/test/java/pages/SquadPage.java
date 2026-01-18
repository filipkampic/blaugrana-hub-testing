package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class SquadPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SquadPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By squadSectionTitle = By.xpath("//h2[text()='Squad']");
    private By squadPlayers = By.cssSelector("ul.squad li");
    private By firstPlayerLink = By.cssSelector("ul.squad a");

    public boolean isSquadSectionDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(squadSectionTitle)
        ).isDisplayed();
    }

    public int getNumberOfPlayers() {
        List<WebElement> players = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(squadPlayers)
        );
        return players.size();
    }

    public void clickFirstPlayer() {
        wait.until(
                ExpectedConditions.elementToBeClickable(firstPlayerLink)
        ).click();
    }
}

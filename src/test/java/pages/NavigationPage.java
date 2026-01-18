package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigationPage {
    private WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By aboutButton = By.linkText("About");
    private By stadiumButton = By.linkText("Stadium");
    private By galleryButton = By.linkText("Gallery");
    private By academyButton =  By.linkText("Academy");
    private By legendsButton =  By.linkText("Legends");

    public void clickAbout() {
        driver.findElement(aboutButton).click();
    }

    public void clickStadium() {
        driver.findElement(stadiumButton).click();
    }

    public void clickGallery() {
        driver.findElement(galleryButton).click();
    }

    public void clickAcademy() {
        driver.findElement(academyButton).click();
    }

    public void clickLegends() {
        driver.findElement(legendsButton).click();
    }

    public boolean isNavigationDisplayed() {
        List<WebElement> buttons = driver.findElements(
                By.cssSelector("nav a")
        );
        return !buttons.isEmpty();
    }
}

package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class HomePage extends Form {
    private final ITextBox searchField = AqualityServices.getElementFactory().getTextBox(By.xpath("//input[contains(@class,'search-input')]"), "Search Input");
    private final IButton acceptPolicyButton = AqualityServices.getElementFactory().getButton(By.xpath("//div[contains(@class,'banner-button policy-accept')]"), "Accept Policy Button");
    private final ILabel resultsContainer = AqualityServices.getElementFactory().getLabel(By.xpath("//div[@class='search-results']"), "Results Container");
    private final By resultsElements = By.xpath("//div/div/p[contains(@class,'search-bar-result__name')]");

    public HomePage() {
        super(By.xpath("//div[@class='results-container']"), "Weather Search Page");
    }

    public void acceptPolicy() {
        acceptPolicyButton.click();
    }

    public boolean isResultListDisplayed() {
        return resultsContainer.state().isDisplayed();
    }

    public void searchForCity(String searchString) {
        searchField.clearAndType(searchString);
    }

    public void clickFirstSearchResult() {
        List<ILabel> results = getElementFactory().findElements(resultsElements, ElementType.LABEL);
        results.get(0).click();
    }
}

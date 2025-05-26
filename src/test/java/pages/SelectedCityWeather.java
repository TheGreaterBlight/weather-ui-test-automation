package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SelectedCityWeather extends Form {
    private final ILabel headerLabel = getElementFactory().getLabel(By.xpath("//a[contains(@class,'header-city-link')]"), "New Page Header");

    public SelectedCityWeather() {
        super(By.xpath("//div[contains(@class,'daily-list-header')]"), "Selected City Weather Page");
    }

    public String getHeaderText() {
        headerLabel.state().waitForDisplayed();
        return headerLabel.getText();
    }
}

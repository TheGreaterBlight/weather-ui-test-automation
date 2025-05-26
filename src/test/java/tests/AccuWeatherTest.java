package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SelectedCityWeather;

public class AccuWeatherTest extends BaseTest {
    private static final String SEARCH_STRING = "New York";

    @Test
    public void testSearchForCity() {
        HomePage homePage = new HomePage();
        homePage.acceptPolicy();
        homePage.searchForCity(SEARCH_STRING);
        Assert.assertTrue(homePage.isResultListDisplayed(), "Search result list is not displayed");
        homePage.clickFirstSearchResult();
        SelectedCityWeather newYorkPage = new SelectedCityWeather();
        String pageHeaderString = newYorkPage.getHeaderText();
        Assert.assertTrue(pageHeaderString.contains(SEARCH_STRING));
    }
}

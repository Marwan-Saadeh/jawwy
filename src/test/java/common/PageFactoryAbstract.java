package common;

import org.openqa.selenium.WebDriver;

public abstract class PageFactoryAbstract {

    public PageFactoryAbstract()
    {
        this.setWebDriver(Browser.createInstance());
    }

    private WebDriver _driver;

    public WebDriver getWebDriver() {
        if (_driver.toString().contains(" (null)")) {
            _driver = Browser.createInstance();
        }
        return _driver;
    }

    public void setWebDriver(WebDriver driver) {
        this._driver = driver;
    }

    public void deleteAllDriverCookies()
    {
        getWebDriver().manage().deleteAllCookies();
    }

    public void CloseDriver() {
        _driver.quit();
    }


}
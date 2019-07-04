package common;

import pages.SampleTestingPageObject;

public class PageFactory extends PageFactoryAbstract {

    private static PageFactory _pageFactory;

    public PageFactory() {
        super();
    }

    public static PageFactory instance() {
        if (_pageFactory == null) {
            _pageFactory = new PageFactory();
        }
        return _pageFactory;
    }

    // pages object

    public SampleTestingPageObject sampleTestingPageObject() {
        return new SampleTestingPageObject(getWebDriver());
    }

}

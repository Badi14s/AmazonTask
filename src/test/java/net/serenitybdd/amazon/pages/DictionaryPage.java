package net.serenitybdd.amazon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@DefaultUrl("http://www.amazon.co.uk")
public class DictionaryPage extends PageObject {

    @FindBy(id="twotabsearchtextbox")
    public WebElementFacade searchTerms;

    @FindBy(xpath ="//input[@value='Go']")
    public WebElementFacade lookupButton;

    @FindBy (id="nav-link-shopall")
    public WebElementFacade shopByDepartment;

    @FindBy (xpath = "//a[text()='Books']")
    public WebElementFacade booksLink;

    @FindBy (id = "searchDropdownBox")
    public WebElementFacade searchDropDown;

    @FindBy (id="add-to-cart-button")
    public WebElementFacade addToBasketButton;

    @FindBy (id="hlb-view-cart-announce")
    public WebElementFacade editBasketButton;

    // Results page

    @FindBy (xpath = "//li[@id='result_0']//div[@class='a-row a-spacing-none scx-truncate-medium']//h2")
    public WebElementFacade firstHeaderTtitleResultsPage;

    @FindBy (xpath = "//div[@class='a-row a-spacing-top-micro a-spacing-mini']//span[@class='sx-badge-text s-color-white']")
    public WebElementFacade firstHeaderBadgeResultsPage;

    @FindBy (xpath = "//h3[@data-attribute='Hardcover']/../..//following-sibling::div[1]//span[@class='a-size-base a-color-price s-price a-text-bold']]")
    public WebElementFacade priceHeaderHardcoverResultsPage;

    // Details page

    @FindBy (id = "productTitle")
    public WebElementFacade headerTtitleDetailsPage;

    @FindBy (id = "a-autoid-3-announce")
    public WebElementFacade hardCoverTypeDetailsPage;

    @FindBy (xpath = "//a[@id='a-autoid-3-announce']//span[@class='a-color-price']")
    public WebElementFacade hardCoverTypePriceDetailsPage;

    @FindBy (xpath = "//i[@class='a-icon a-icon-addon p13n-best-seller-badge']")
    public WebElementFacade headerBadgeDetailsPage;

    // Basket section

    @FindBy (xpath = "//h1[@class='a-size-medium a-text-bold']")
    public WebElementFacade addedToBasketNotification;

    @FindBy (xpath = "//div[@id='huc-v2-order-row-images']//div[@class='a-box-inner']")
    public WebElementFacade itemAddedToBasket;

    @FindBy (id="cart-page-wrap")
    public WebElementFacade cartPage;

    @FindBy (xpath = "//span[@class='a-size-medium sc-product-title']")
    public WebElementFacade titleInBasketSection;

    @FindBy (xpath = "//b[text()='Basket subtotal']/..")
    public WebElementFacade itemsInBasketSection;

    // Basket list

    @FindBy (xpath = "//div[@data-item-count='2']")
    public WebElementFacade secondItemInBasketList;



    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

//    public List<String> getDefinitions() {
//        WebElementFacade definitionList = find(By.tagName("ol"));
//        List<WebElement> results = definitionList.findElements(By.tagName("li"));
//        return convert(results, toStrings());
//    }
//
//    private Converter<WebElement, String> toStrings() {
//        return new Converter<WebElement, String>() {
//            public String convert(WebElement from) {
//                return from.getText();
//            }
//        };
//    }

    public void select_option_from_drop_down_menu(String kewword) {
        Select select = new Select(searchDropDown);
        List<WebElement> options = select.getAllSelectedOptions();
        for (WebElement option : options) {
            if(kewword.equals(option.getText()))
                option.click();
        }

    }

    public void click_shop_by_department() {
        shopByDepartment.click();
    }

    public void clik_books_link() {
        booksLink.click();
    }



}
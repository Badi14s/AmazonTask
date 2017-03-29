package net.serenitybdd.amazon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

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
    //@FindBy (xpath = "//select[@class='nav-search-dropdown searchSelect']")
    public WebElementFacade searchDropDown;

    @FindBy (xpath = "//div[@class='nav-search-scope nav-sprite']")
    public WebElementFacade navSpriteDropDown;

    @FindBy (xpath = "//select[@id='searchDropdownBox']//option")
    public WebElementFacade optionsDropDown;

    @FindBy (xpath = "//select[@id='searchDropdownBox']//option[text()='Books']")
    public WebElementFacade optionBook;

    @FindBy (id="add-to-cart-button")
    public WebElementFacade addToBasketButton;

    @FindBy (id="hlb-view-cart-announce")
    public WebElementFacade editBasketButton;

    // Results page

    @FindBy (xpath = "//li[@id='result_0']//div[@class='a-row a-spacing-none scx-truncate-medium']//h2")
    public WebElementFacade firstHeaderTtitleResultsPage;

    @FindBy (xpath = "//div[@class='a-row a-spacing-top-micro a-spacing-mini']//span[@class='sx-badge-text s-color-white']")
    public WebElementFacade firstHeaderBadgeResultsPage;

    @FindBy (xpath = "//h3[@data-attribute='Hardcover']/../../following-sibling::div[1]//span[contains(text(), '£')]")
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

    @FindBy (xpath = "//span[@class='a-size-medium sc-product-title a-text-bold'][1]")
    public WebElementFacade firstHeaderTitleBasketList;


    @FindBy (xpath = "//span[@class='a-size-small a-color-secondary sc-product-binding'][1]")
    public WebElementFacade firstHeaderSellTypeBasketList;

    @FindBy (xpath = "//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold'][1]")
    public WebElementFacade firstHeaderPriceBasketList;

    @FindBy (xpath = "//span[@class='a-dropdown-prompt'][1]")
    public WebElementFacade firstHeaderQuantityBasketList;

    @FindBy (className = "a-size-medium a-color-price sc-price sc-white-space-nowrap  sc-price-sign")
    public WebElementFacade subtotalPrice;


//    public void click_shop_by_department() {
//        shopByDepartment.click();
//    }
//
//    public void click_books_link() {
//        booksLink.click();
//    }


}
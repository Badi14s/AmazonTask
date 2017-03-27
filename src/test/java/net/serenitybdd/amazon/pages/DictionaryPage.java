package net.serenitybdd.amazon.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static ch.lambdaj.Lambda.convert;
import static org.junit.Assert.assertTrue;

@DefaultUrl("http://www.amazon.co.uk")
//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class DictionaryPage extends PageObject {

    @FindBy(id="twotabsearchtextbox")
    public WebElementFacade searchTerms;

    @FindBy(xpath ="//input[@value='Go']")
    public WebElementFacade lookupButton;

    @FindBy (id="nav-link-shopall")
    public WebElementFacade shopByDepartment;

    @FindBy (xpath = "//a[text()='Books']")
    public WebElementFacade booksLink;

//    @FindBy (className = "nav-search-dropdown searchSelect")
    @FindBy (xpath = "//select[@class='nav-search-dropdown searchSelect']")
    public WebElementFacade searchDropDwon;

    @FindBy (xpath = "//div[@class='a-row a-spacing-none scx-truncate-medium'][1]//h2")
    public WebElementFacade firstHeaderTtitle;

    @FindBy (xpath = "//*[containsfirstHeader(@class, 'sx-badge-text s-color-white')][1]")
    public WebElementFacade firstHeaderBadge;

    @FindBy (xpath = "//h3[1]")
    public WebElementFacade priceHeader;

    @FindBy (xpath = "//h1/span[1]")
    public WebElementFacade headerTtitle;

    @FindBy (id="add-to-cart-button")
    public WebElementFacade addToBasketButton;

    @FindBy (id="hlb-view-cart-announce")
    public WebElementFacade editBasketButton;

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

    public void click_shop_by_department() {
        shopByDepartment.click();
    }

    public void clik_books_link() {
        booksLink.click();
    }

    public void select_book_drop_down() {
        Select select = new Select(searchDropDwon);
//        select.deselectAll();
        select.selectByVisibleText("Books");
    }

}
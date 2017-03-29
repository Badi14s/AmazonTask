package net.serenitybdd.amazon.steps.serenity;

import net.serenitybdd.amazon.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void navigate_to_homepage() {
        dictionaryPage.open();
    }

    @Step
    public void navigate_to_section_books(String keyword) {
        Select dropdown = new Select(getDriver().findElement((By.id("searchDropdownBox"))));
        dropdown.selectByVisibleText(keyword);
    }

    @Step
    public void look_for(String term) {
        dictionaryPage.searchTerms.type(term);
        dictionaryPage.lookupButton.click();
    }

    // Results page

    @Step
    public void verify_title_contains_text_results_page(String keyword){
        assertTrue(dictionaryPage.firstHeaderTtitleResultsPage.containsText(keyword));
    }

    @Step
    public void verify_hardcover_type_price_results_page_is(String keyword){
        assertTrue(dictionaryPage.priceHeaderHardcoverResultsPage.containsText(keyword));
    }

    @Step
    public void verify_badge_contains_text_results_page(String keyword){
        assertTrue(dictionaryPage.firstHeaderBadgeResultsPage.containsText(keyword));
    }

    @Step
    public void click_title_results_page() {
        dictionaryPage.firstHeaderTtitleResultsPage.click();
    }

    // Details page

    @Step
    public void verify_title_contains_text_details_page(String keyword){
        dictionaryPage.headerTtitleDetailsPage.containsText(keyword);
    }

    @Step
    public void verify_badge_contains_text_details_page(String keyword){
        assertTrue(dictionaryPage.headerBadgeDetailsPage.containsText(keyword));
    }

    @Step
    public void verify_hardcover_type_is_selected_details_page() {
        String GetAttribute = dictionaryPage.hardCoverTypeDetailsPage.getAttribute("href");
        String Attribute = "javascript:void(0)";
        assertTrue(GetAttribute.equals(Attribute));
    }

    @Step
    public void verify_hardcover_type_price_details_page_is(String keyword){
        dictionaryPage.hardCoverTypePriceDetailsPage.containsText(keyword);
    }

    @Step
    public void click_add_to_basket_button() {
        dictionaryPage.addToBasketButton.click();
    }

    // Basket section

    @Step
    public void verify_item_is_added_to_basket(String keyword){
        assertTrue(dictionaryPage.addedToBasketNotification.containsText(keyword));
    }

    @Step
    public void verify_title_in_basket_section_contains_text(String keyword){
        Actions action = new Actions(dictionaryPage.getDriver());
        action.moveToElement(dictionaryPage.itemAddedToBasket).perform();
        assertTrue(dictionaryPage.titleInBasketSection.containsText(keyword));
        action.moveToElement(dictionaryPage.cartPage).perform();
    }

    @Step
    public void verify_items_in_basket_section_contains_text(String keyword){
        assertTrue(dictionaryPage.itemsInBasketSection.containsText(keyword));
    }

    @Step
    public void click_edit_basket_button() {
        dictionaryPage.editBasketButton.click();
    }

    // Basket list

    @Step
    public void verify_one_item_is_in_list() {
        dictionaryPage.secondItemInBasketList.shouldNotBeVisible();
    }

    @Step
    public void verify_first_item_title_contains_text_list_page(String keyword){
        assertTrue(dictionaryPage.firstHeaderTitleBasketList.containsText(keyword));
    }

    @Step
    public void verify_first_item_sell_type_is(String keyword){
        assertTrue(dictionaryPage.firstHeaderSellTypeBasketList.containsText(keyword));
    }

    @Step
    public void verify_first_item_hardcover_type_price_list_page_is(String keyword){
        assertTrue(dictionaryPage.firstHeaderPriceBasketList.containsText(keyword));
    }

    @Step
    public void verify_first_item_quantity_list_page_is(int number){
        int compare = Integer.parseInt((dictionaryPage.firstHeaderQuantityBasketList.getText()));
        assertTrue(compare == number);
    }

    @Step
    public void verify_subtotal_price_list_page_is(String keyword){
        assertTrue(dictionaryPage.subtotalPrice.containsText(keyword));
    }

}
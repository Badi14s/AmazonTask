package net.serenitybdd.amazon.steps.serenity;

import net.serenitybdd.amazon.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }

    @Step
    public void select_drop_down_menu(String kewword) {
//        WebDriverWait wait = new WebDriverWait(dictionaryPage.getDriver(), 5);
//        wait.until(ExpectedConditions.visibilityOf(dictionaryPage.searchDropDown));
//        Select select = new Select(dictionaryPage.searchDropDown);
//        select.deselectAll();
//        select.selectByVisibleText(kewword);
        dictionaryPage.select_option_from_drop_down_menu(kewword);

    }

    @Step
    public void navigate_to_homepage() {
        dictionaryPage.open();
    }

    @Step
    public void navigate_to_section_books() {
        dictionaryPage.click_shop_by_department();
        dictionaryPage.clik_books_link();
//        dictionaryPage.select_book_drop_down();

    }

    @Step
    public void look_for(String term) {
        dictionaryPage.enter_keywords(term);
        dictionaryPage.lookup_terms();
    }

    // Results page

    @Step
    public void verify_title_contains_text_results_page(String kewword){
        assertTrue(dictionaryPage.firstHeaderTtitleResultsPage.containsText(kewword));
    }

    @Step
    public void verify_hardcover_type_price_results_page(String kewword){
        assertTrue(dictionaryPage.priceHeaderHardcoverResultsPage.containsText(kewword));
    }

    @Step
    public void verify_badge_results_page(String kewword){
        assertTrue(dictionaryPage.firstHeaderBadgeResultsPage.containsText(kewword));
    }

    @Step
    public void click_title_results_page() {
        dictionaryPage.firstHeaderTtitleResultsPage.click();
    }


    // Details page

    @Step
    public void verify_title_contains_text_details_page(String kewword){
        dictionaryPage.headerTtitleDetailsPage.containsText(kewword);
    }

    @Step
    public void verify_badge_details_page(String kewword){
        assertTrue(dictionaryPage.headerBadgeDetailsPage.containsText(kewword));
    }

    @Step
    public void verify_hardcover_type_is_selected_details_page() {
        String GetAttribute = dictionaryPage.hardCoverTypeDetailsPage.getAttribute("href");
        String Attribute = "javascript:void(0)";
        assertTrue(GetAttribute.equals(Attribute));
    }

    @Step
    public void verify_hardcover_type_price_details_page(String kewword){
        dictionaryPage.hardCoverTypePriceDetailsPage.containsText(kewword);
    }

    @Step
    public void click_add_to_basket_button() {
        dictionaryPage.addToBasketButton.click();
    }

    // Basket section

    @Step
    public void verify_item_is_added_to_basket(String kewword){
        assertTrue(dictionaryPage.addedToBasketNotification.containsText(kewword));
    }

    @Step
    public void verify_title_in_basket_section_contains_text(String kewword){
        Actions action = new Actions(dictionaryPage.getDriver());
        action.moveToElement(dictionaryPage.itemAddedToBasket).perform();
        assertTrue(dictionaryPage.titleInBasketSection.containsText(kewword));
        action.moveToElement(dictionaryPage.cartPage).perform();
    }

    @Step
    public void verify_items_in_basket_section_contains_text(String kewword){
        assertTrue(dictionaryPage.itemsInBasketSection.containsText(kewword));
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




}
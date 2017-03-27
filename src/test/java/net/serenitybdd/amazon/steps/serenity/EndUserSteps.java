package net.serenitybdd.amazon.steps.serenity;

import net.serenitybdd.amazon.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
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

    @Step
    public void check_title_contains_text(String kewword){
        assertTrue(dictionaryPage.firstHeaderTtitle.containsText(kewword));
    }

    @Step
    public void verify_badge(String kewword){
        assertTrue(dictionaryPage.firstHeaderBadge.containsText(kewword));
    }

    @Step
    public void click_title() {
        dictionaryPage.firstHeaderTtitle.click();
    }

    @Step
    public void check_title_details_contains_text(String kewword){
        dictionaryPage.headerTtitle.containsText(kewword);
    }

    @Step
    public void click_add_to_basket_button() {
        dictionaryPage.addToBasketButton.click();
    }

}
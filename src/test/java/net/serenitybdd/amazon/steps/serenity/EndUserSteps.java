package net.serenitybdd.amazon.steps.serenity;

import net.serenitybdd.amazon.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

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

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void navigate_to_homepage() {
        dictionaryPage.open();
    }

    @Step
    public void navigate_to_section_books() {
        dictionaryPage.find().click();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}
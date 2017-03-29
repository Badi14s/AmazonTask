package net.serenitybdd.amazon.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.amazon.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    private String bookTitle = "Harry Potter and The Cursed Child - Parts One and Two";
    private String bookPrice = "£9.00";
    private int NumberItemsInBakset = 1;
    private String itemsInBakset = "("+Integer.toString(NumberItemsInBakset)+" item";

    @Steps
    EndUserSteps I;

    @Given("^I navigate to homepage$")
    public void i_navigate_to_homepage() {
        I.navigate_to_homepage();
    }

    @Given("^I navigate to section books$")
    public void i_navigate_to_section_books() {
        I.navigate_to_section_books();
        I.select_drop_down_menu("Baby");
    }

    @Given("^I search for book by title$")
    public void i_search_for_book_by_title() {
        I.look_for(bookTitle);
    }

    @Given("^I see that the first item's title on results page matches$")
    public void i_see_that_the_first_item_s_title_on_results_page_matches() {
        I.verify_title_contains_text_results_page(bookTitle);
    }


    @Given("^I see that the first item has badge Best Seller$")
    public void i_see_that_the_first_item_has_badge_Best_Seller() {
        I.verify_badge_results_page("Best Seller");
    }

//    @Given("^I see that the first item's price for type Hardcover matches$")
//    public void i_see_that_the_first_item_s_price_for_type_Hardcover_matches() {
////        I.check_hardcover_type_price_results_page(bookPrice);
//    }

    @Given("^I open the first item from results page$")
    public void i_open_the_first_item_from_results_page() {
        I.click_title_results_page();
    }

    @Given("^I see title on book details page mathes$")
    public void i_see_title_on_book_details_page_mathes() {
        I.verify_title_contains_text_details_page(bookTitle);
    }

    @Given("^I see badge Best Seller on book details page$")
    public void i_see_badge_Best_Seller_on_book_details_page() {
        I.verify_badge_details_page("Best Seller");
    }

    @Given("^I see that type Hardcover is selected$")
    public void i_see_that_type_Hardcover_is_selected() {
        I.verify_hardcover_type_is_selected_details_page();
    }

    @Given("^I see price for type Hardcover on book details page matches$")
    public void i_see_price_for_type_Hardcover_on_book_details_page_matches() {;
        I.verify_hardcover_type_price_details_page(bookPrice);
    }

    @When("^I add item to basket$")
    public void i_add_item_to_basket() {
        I.click_add_to_basket_button();
    }

    @When("^I see notification that item is added to the basket$")
    public void i_see_notification_that_item_is_added_to_the_basket() {
        I.verify_item_is_added_to_basket("Added to Basket");
    }

    @When("^I see that title in the basket matches$")
    public void i_see_that_title_in_the_basket_matches() {
        I.verify_title_in_basket_section_contains_text(bookTitle);
    }

    @When("^I see one item in the basket$")
    public void i_see_one_item_in_the_basket() {
        I.verify_items_in_basket_section_contains_text(itemsInBakset);
    }

    @When("^I click on Edit basket$")
    public void i_click_on_Edit_basket() {
         I.click_edit_basket_button();
    }

    @Then("^I see one item in basket list$")
    public void i_see_one_item_in_basket_list() {
        I.verify_one_item_is_in_list();
    }

    @Then("^I see that title in basket list matches$")
    public void i_see_that_title_in_basket_list_matches() {
    }

    @Then("^I see type Hardcover in basket list$")
    public void i_see_type_Hardcover_in_basket_list() {
    }

    @Then("^I see price in basket list matches$")
    public void i_see_price_in_basket_list_matches() {
    }

    @Then("^I see that quantity in basket list mathes$")
    public void i_see_that_quantity_in_basket_list_mathes() {
    }

    @Then("^I see subtotal price in basket list matches$")
    public void i_see_subtotal_price_£_in_basket_list_matches() {
    }

}

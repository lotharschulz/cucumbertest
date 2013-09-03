package info.lotharschulz.cucumber.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MyStringChangerStepdefs {
    private MyString ms ;
    private String expectedPrefixResult;
    private String expectedSuffixResult;

    @Given("^I have MyString$")
    public void I_have_a_MyStringChanger_instance(){
        ms = new MyString();
    }

    @Given("^I have a MyString with \"([^\"]*)\"$")
    public void I_have_a_MyStringChanger_with(String content) {
        ms.setString(content);
    }

    @When("^I add the prefix \"([^\"]*)\"$")
    public void I_ask_it_to_add_prefix(String prefix) {
        expectedPrefixResult = ms.addPrefixString(prefix);
    }

    @Then("^prefix should be added at the start position of MyString and the result is \"([^\"]*)\"$")
    public void prefix_answer_is(String expectedPrefix) {
        assertEquals(expectedPrefixResult, expectedPrefix);
    }

    @When("^I add the suffix \"([^\"]*)\"$")
    public void I_ask_it_to_add_suffix(String suffix) {
        expectedSuffixResult = ms.addSuffixString(suffix);
    }

    @Then("^suffix  should be added at the end position of MyString and the result is \"([^\"]*)\"$")
    public void suffix_answer_is(String expectedSuffix) {
        assertEquals(expectedSuffixResult, expectedSuffix);
    }

    @When("^I add again the suffix \"([^\"]*)\"$")
    public void I_ask_it_again_to_add_suffix(String suffix) {
        expectedSuffixResult = ms.addSuffixString(suffix);
    }

    @Then("^suffix should be added and the result is not \"([^\"]*)\"$")
    public void suffix_answer_is_not(String expectedSuffix) {
        assertNotEquals(expectedSuffixResult, expectedSuffix);
    }

}

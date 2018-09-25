package com.evolutionnext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.inject.Inject;

/**
 * @author Daniel Hinojosa
 * @since 5/6/13 12:06 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class CalculatorFeatureSteps {
    @Inject
    private CalculatorWorld calculatorWorld;


    @Given("^a calculator instance$")
    public void a_calculator_instance() {
        calculatorWorld.calculator = new Calculator();
    }

    @When("^the sum method is given two numbers$")
    public void the_sum_method_is_given_two_numbers() {
        calculatorWorld.actual = calculatorWorld.calculator.sum(12, 14);
        calculatorWorld.expected = 26;
    }

    @When("^the sum method is given two numbers, (\\d+) and (\\d+)$")
    public void the_sum_method_is_given_two_numbers(int number1, int number2) {
        calculatorWorld.actual = calculatorWorld.calculator.sum(number1, number2);
        calculatorWorld.expected = number1 + number2;
    }

    @Then("^the calculator should return the sum of the two numbers$")
    public void the_calculator_should_return_the_sum_of_the_two_numbers() {
        Assert.assertTrue(calculatorWorld.actual == calculatorWorld.expected);
    }
}

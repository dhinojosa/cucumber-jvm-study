package com.evolutionnext;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Daniel Hinojosa
 * @since 5/6/13 1:06 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class CalculatorDataTableFeatureSteps {
    private List<List<String>> info;
    private Calculator calculator;
    private List<List<Integer>> results = new ArrayList<List<Integer>>(4);

    @Given("^the following calculator entries:$")
    public void the_following_calculator_entries(DataTable dataTable) throws Throwable {
        info = dataTable.raw();
    }


    @And("^a calculator instance generated from the table$")
    public void a_calculator_instance_generated_from_the_table() throws Throwable {
        this.calculator = new Calculator();
    }

    @When("^each the first two columns are placed into the calculator$")
    public void each_the_first_two_columns_are_placed_into_the_calculator() throws Throwable {
        List<List<String>> data = info.subList(1, info.size());
        for (List<String> item : data) {
            int value1 = Integer.parseInt(item.get(0));
            int value2 = Integer.parseInt(item.get(1));
            int expected = Integer.parseInt(item.get(2));
            List<Integer> resultItem = new ArrayList<Integer>();
            int actual = calculator.sum(value1, value2);
            resultItem.add(expected);
            resultItem.add(actual);
            results.add(resultItem);
        }
    }

    @Then("^the calculator should return the value of the last column$")
    public void the_calculator_should_return_the_value_of_the_last_column() throws Throwable {
        for (List<Integer> result : results) {
            assertEquals(result.get(0), result.get(1));
        }
    }
}

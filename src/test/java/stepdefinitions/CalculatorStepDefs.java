package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepDefs {
    private Calculator calculator = new Calculator();
    private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("first number: {int}")
    public void set_first_number(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Given("second number: {int}")
    public void set_second_number(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @When("two numbers are summed")
    public void sum_two_numbers() {
        result = calculator.plus(firstNumber, secondNumber);
    }

    @Then("result must be {int}")
    public void check_result(int result) {
        Assertions.assertTrue(this.result > 0, "Sum is less or equals");
        Assertions.assertEquals(result, this.result, "Incorrect sum!");
    }
}

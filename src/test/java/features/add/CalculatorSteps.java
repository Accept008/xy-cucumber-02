package features.add;

import com.qz.xy.add.Calculator;
import io.cucumber.java8.En;
import org.junit.Assert;
import org.hamcrest.Matchers;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.hamcrest.Matchers;

// 执行Calculator复制在日志行输出的方法
public class CalculatorSteps implements En {

    private Calculator calculator;
    private int result;

    public CalculatorSteps(){
        Given("x is {int} and y is {int}", (Integer a, Integer b) -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
            this.calculator = new Calculator(a, b);
        });

        When("invoke add method", () -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
            result = this.calculator.add();
        });

        Then("the result is {int}", (Integer expectValue) -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
            Assert.assertThat(result, Matchers.equalTo(expectValue));
        });
    }

//    @Given("x is {int} and y is {int}")
//    public void xIsAndYIs(Integer a, Integer b) {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new cucumber.api.PendingException();
//        this.calculator = new Calculator(a, b);
//    }
//
//    @When("invoke add method")
//    public void invokeAddMethod() {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new cucumber.api.PendingException();
//        result = this.calculator.add();
//    }
//
//    @Then("the result is {int}")
//    public void theResultIs(Integer expectValue) {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new cucumber.api.PendingException();
//        Assert.assertThat(result, Matchers.equalTo(expectValue));
//    }
}

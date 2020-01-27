package Calculadora_PracticaTotal;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcSumaCucumberTest {
  public double resultado  = 0.0;
  public double numA = 0.0;
  public double numB = 0.0;
  @Given("^dos datos numericos ([-+]?\\d+),([-+]?\\d+)$")
  public void given_dos_datos_numericos(double x , double y) throws Throwable {
	  numA= x;
	  numB = y;
  }

  @When("^calculo la suma con estos datos numericos$")
  public void when_calculo_la_operacion_con_estos_datos_numericos() throws Throwable {
	  Calculadora calc = new Calculadora();
	  resultado =calc.getSuma(numA,numB);
  }
  @Then("^resultado debe ser ([-+]?\\d+)$")
  public void then_resultado_debe_ser(double x) throws Throwable {
	  Assert.assertEquals(x, resultado,0.001);
  }
}






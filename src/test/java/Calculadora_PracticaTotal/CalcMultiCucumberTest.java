package Calculadora_PracticaTotal;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CalcMultiCucumberTest {
	public double resultado1  = 0.0;
	  public double numA1 = 0.0;
	  public double numB1 = 0.0;
	  @Given("^dos numeros ([-+]?\\d+),([-+]?\\d+)$")
	  public void given_dos_datos_numericos(double x1 , double y1) throws Throwable {
		  numA1= x1;
		  numB1 = y1;
	  }

	  @When("^calculo la multiplicacion con estos numeros$")
	  public void when_calculo_la_operacion_con_estos_datos_numericos() throws Throwable {
		  Calculadora calc1 = new Calculadora();
		  resultado1 =calc1.getMultiplicacion(numA1,numB1);
	  }
	  @Then("^su resultado es ([-+]?\\d+)$")
	  public void then_resultado_debe_ser(double x1) throws Throwable {
		  Assert.assertEquals(x1, resultado1,0.001);
	  }
}

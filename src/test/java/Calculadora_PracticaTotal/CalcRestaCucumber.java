package Calculadora_PracticaTotal;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CalcRestaCucumber {
	public double resultado2  = 0.0;
	  public double numA2 = 0.0;
	  public double numB2 = 0.0;
	  @Given("^Dado dos numeros ([-+]?\\d+),([-+]?\\d+)$")
	  public void given_dos_datos_numericos(double x2 , double y2) throws Throwable {
		  numA2= x2;
		  numB2 = y2;
	  }

	  @When("^calculo la resta de los mismos$")
	  public void when_calculo_la_operacion_con_estos_datos_numericos() throws Throwable {
		  Calculadora calc2 = new Calculadora();
		  resultado2 =calc2.getResta(numA2,numB2);
	  }
	  @Then("^obteniendo como respuesta ([-+]?\\d+)$")
	  public void then_resultado_debe_ser(double x2) throws Throwable {
		  Assert.assertEquals(x2, resultado2,0.001);
	  }
}

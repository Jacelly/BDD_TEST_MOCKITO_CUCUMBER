package Calculadora_PracticaTotal;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

//Mockito Test
@RunWith(MockitoJUnitRunner.class)
public class CalculadoraMockitoTest {
	@InjectMocks
	Calculadora calc1 = new Calculadora();//Dependiente
	@Mock
	ICalculadora calc2;//Dependencia, Le dice a Mockito que sea un mock de la instancia de ICalculadora
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); //Le dice a Mockito que cree los simulacros basados ​​en la anotación @Mock
	@Test
	public void probarSuma1() {
		System.out.println("Probando Suma1 Mockito");
		when(calc2.getSuma1(85, 5)).thenReturn(90.0); //Comportamientos predecibles de la dependencia
		assertEquals(90.0, calc2.getSuma1(85,5),0.01);
		verify(calc2).getSuma1(85,5); //Verifique que el método de Suma fue invocado en el objeto simulado
	}

	@Test
	public void probarResta1() {
		System.out.println("Probando Resta2 Mockito");
		when(calc2.getResta2(85, 5)).thenReturn(80.0); //Comportamientos predecibles de la dependencia
		assertEquals(80.0, calc2.getResta2(85,5),0.01);
		verify(calc2).getResta2(85,5); //Verifique que el método de Resta fue invocado en el objeto simulado
	}
	@Test
	public void probarMultiplicacion3() {
		System.out.println("Probando Multiplicacion3 Mockito");
		when(calc2.getMultiplicacion3(5, 5)).thenReturn(25.0); //Comportamientos predecibles de la dependencia
		assertEquals(25.0, calc2.getMultiplicacion3(5,5),0.01);
		verify(calc2).getMultiplicacion3(5,5); //Verifique que el método de Multiplicacion fue invocado en el objeto simulado
	}
	
	@Test
	public void probarObtenerSuma4() {
		System.out.println("Probando Multiplicacion4 Mockito");
		when(calc2.getSuma1(5, 5)).thenReturn(10.0); //Comportamientos predecibles de la dependencia
		assertEquals(10.0, calc1.ObtenerSuma(5,5),0.01);
		verify(calc2).getSuma1(5,5); //Verifique que el método de Suma fue invocado en el objeto simulado

	}
	
	


}

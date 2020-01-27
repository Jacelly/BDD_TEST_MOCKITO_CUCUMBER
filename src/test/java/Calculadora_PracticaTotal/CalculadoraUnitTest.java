package Calculadora_PracticaTotal;

import static org.junit.Assert.*;
import org.junit.Test;
import Calculadora_PracticaTotal.Calculadora;
public class CalculadoraUnitTest {
	Calculadora calc = new Calculadora();
	
	//PRUEBAS UNITARIAS PARA FUNCION Suma
		@Test
		public void probarSuma1() {
			System.out.println("Probando Suma1 UnitTest");
			assertEquals(10.0, calc.getSuma(5, 5),0.01);
		}
		@Test
		public void probarSuma2() {
			System.out.println("Probando Suma2 UnitTest");
			assertEquals(0.0, calc.getSuma(5, -5),0.01);
		}
		@Test
		public void probarSuma3() {
			System.out.println("Probando Suma3 UnitTest");
			assertEquals(3.0, calc.getSuma(-5, 8),0.01);
		}
		@Test
		public void probarSuma4() {
			System.out.println("Probando Suma4 UnitTest");
			assertEquals(-13.0, calc.getSuma(-5, -8),0.01);
		}
		//PRUEBAS UNITARIAS PARA FUNCION Resta
		@Test
		public void probarResta5() {
			System.out.println("Probando Resta5 UnitTest");
			assertEquals(0.0, calc.getResta(5, 5),0.01);
		}
		@Test
		public void probarResta6() {
			System.out.println("Probando Resta6 UnitTest");
			assertEquals(10.0, calc.getResta(5, -5),0.01);
		}
		@Test
		public void probarResta7() {
			System.out.println("Probando Resta7 UnitTest");
			assertEquals(-13.0, calc.getResta(-5, 8),0.01);
		}
		@Test
		public void probarResta8() {
			System.out.println("Probando Resta8 UnitTest");
			assertEquals(3.0, calc.getResta(-5, -8),0.01);
		}
	//PRUEBAS UNITARIAS PARA FUNCION Multiplicacion
	@Test
	public void probarMultiplicacion9() {
		System.out.println("Probando Multiplicacion9 UnitTest");
		assertEquals(25.0, calc.getMultiplicacion(5, 5),0.01);
	}
	@Test
	public void probarMultiplicacion10() {
		System.out.println("Probando Multiplicacion10 UnitTest");
		assertEquals(-25.0, calc.getMultiplicacion(5, -5),0.01);
	}
	@Test
	public void probarMultiplicacion11() {
		System.out.println("Probando Multiplicacion11 UnitTest");
		assertEquals(-40.0, calc.getMultiplicacion(-5, 8),0.01);
	}
	@Test
	public void probarMultiplicacion12() {
		System.out.println("Probando Multiplicacion12 UnitTest");
		assertEquals(40.0, calc.getMultiplicacion(-5, -8),0.01);
	}
	
	

}

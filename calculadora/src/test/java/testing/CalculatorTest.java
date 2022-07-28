package testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	
	private Calculator calculatorUnderTest;
	private static int testNumber = 1;
	private static Instant startedAt;
	
	//ejecuta un método antes de realizar cada prueba. Muy buen lugar para instalar o organizar prerequisitos para cada prueba
	@BeforeEach
	public void initCalculator() {
		calculatorUnderTest = new Calculator();
		System.out.println(MessageFormat.format("Llamada que se hace automáticamente antes del test {0}.", testNumber));
	}
	
	
	//Ejecuta un método después de realizar cada prueba. Muy buen lugar para limpiar o satisfacer algunos requisitos
	@AfterEach
	public void undefCalculator() {
		System.out
				.println(MessageFormat.format("Llamada que se hace automáticamente después del test {0}.", testNumber));
		testNumber++;
		calculatorUnderTest = null;
	}
	
	//Designa un método estático para que sea ejecutada antes del conjunto de pruebas. 
	//Se puede utilizar para initilizar variables estáticas útiles a las pruebas
	@BeforeAll
	public static void initStartingTime() {
		System.out.println(MessageFormat.format("Llamada antes de realizar la prueba {0}.", testNumber));
		startedAt = Instant.now();
	}
	
	
	//Designa un método estático para que sea ejecutada después de haber terminado las pruebas. 
	//Se puede utilizar para limpiar dependencias estáticas o realizar operación de cara a la prueba global. 
	@AfterAll
	public static void showTestduracion() {
		testNumber -= 1;
		System.out.println(MessageFormat.format("Hemos terminado y realizado {0} pruebas.", testNumber));
		Instant endedAt = Instant.now();
		long duracion = Duration.between(startedAt, endedAt).toMillis();
		System.out.println(MessageFormat.format("Duración de las pruebas: {0} ms", duracion));
	}	
	
	
	@ParameterizedTest(name = "{0} x 0 es siempre igual a 0")
	@ValueSource(ints = { 1, 2, 42, 1001, 5089 })
	public void multiply_shouldReturnZero_ofZeroWithMultipleIntegers(int arg) {
		// ARRANGE Todo está listo

		// ACT -- multiplicar por zero
		final int ACTUALRESULT = calculatorUnderTest.product(arg, 0);
		// ASSERT
		assertEquals(0, ACTUALRESULT);
		
	}
	
	
	//Quieres repetir el mismo test varias veces con varios parámetros -->combinado con @CsvSource
	@ParameterizedTest(name = "{0} + {1} es igual a {2}")
	@CsvSource({ "1,1,2", "2,3,5", "42,57,99" })
	public void add_shouldReturnTheSum_ofMultipleIntegers(int arg1, int arg2, int expectResult) {
		// ARRANGE Todo está listo

		// ACT -- multiplicar por zero
		final int ACTUALRESULT = calculatorUnderTest.add(arg1, arg2);
		// ASSERT
		assertEquals(expectResult, ACTUALRESULT);
	}
	
	@Test
	@Timeout(1)
	public void longcalcul_shouldComputeInLessThan1Second() {
		// ARRANGE Todo está listo

		// ACT -- multiplicar por zero
		calculatorUnderTest.longCalculation();
		// ASSERT
		//...
	}
	
	
	
	
	@Test
	void testAddTwoPositiveNumbers() {
		//ORGANIZAR
		int a = 2; 
		int b = 3; 
		//Calculator calculator = new Calculator(); 		
		//ACTUAR
		int suma = calculatorUnderTest.add(a, b); 		
		//AVERIGUAR
		assertEquals(5, suma);
		
		assertThat(suma).isEqualTo(5); 
	}
	
	
	@Test
	void testMultiplyTwoNumbers() {
		//puesto por defecto
		//fail("Not yet implemented");		
		//ARRANGE
		int a = -2; 
		int b = 3; 
		//Calculator calculator = new Calculator(); 
		//ACT
		int producto = calculatorUnderTest.product(a, b); 
		//ASSERT
		assertEquals(-6, producto);//.equals
		//assertSame(calculator, calculator);//==
		//assertTrue(false);//true
	}

}

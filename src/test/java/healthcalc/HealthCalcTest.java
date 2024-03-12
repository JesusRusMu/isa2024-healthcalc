package healthcalc;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	
	private final HealthCalcImpl c= new HealthCalcImpl();



	/// WEIGHT TEST /////

	@Test // Primero
	@DisplayName("Test de altura mayor a la esperada")
	public void testAlturaMayor(){
		assertThrows( IllegalArgumentException.class, () -> c.idealWeight(300,'M'), "La altura introducida es mayor a la esperada" );
	}

	@Test // Segundo
	@DisplayName("Test de altura menor a la esperada")
	public void testAlturaMenor(){
		assertThrows( IllegalArgumentException.class, () -> c.idealWeight(5,'M'), "La altura introducida es menor a la esperada" );
	}

	@Test // Tercero
	@DisplayName("Test de altura negativa")
	public void testAlturaNegativa(){
		assertThrows( IllegalArgumentException.class, () -> c.idealWeight(-1,'M'), "La altura introducida es nehativa y no es válida" );
	}

	@Test // Cuarto
	@DisplayName("Test de hombre")
	public void testHombre() throws Exception{

		int a2= 170;

		float IW = a2 - 100 - (a2 - 150) / 4f;
		assertEquals(IW, c.idealWeight(a2, 'm'));

	}

	@Test // Quinto
	@DisplayName("Test de mujer")
	public void testMujer() throws Exception{

		int a2= 170;
		

		float IW = a2 - 100 - (a2 - 150) / 2.5f;
		assertEquals(IW, c.idealWeight(a2, 'w'));


	}


	@Test // Sexto
	@DisplayName("Test problema de género")
	public void testProblemaGenero(){
		assertThrows( IllegalArgumentException.class, () -> c.idealWeight(180,'f'), "No es válido el carácter introducido en el campo de género solo es aceptable 'm' o 'w'" );
	}


	//// basalMetaolicrate() /////


	@Test // Primero

	@DisplayName("Test entrada introducida en el campo del sexo BMR")
	public void testSexoBMR() {
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(70, 170, 'H', 30), 	"El valor introducido en el campo de sexo solo puede ser 'm' o 'w' ");
	}

	@Test // Segundo

	@DisplayName("Test entrada introducida en el campo de edad BMR")
	public void testEdadBMR() {
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(70, 170, 'M', 30000), 	"El valor introducido en el campo de edad solo puede estar dentro del intervalo (0,100] ");
	}


	@Test // Tercero

	@DisplayName("Test entrada introducida en el campo de peso BMR")
	public void testPesoBMR() {
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(-40, 170, 'M', 30), 	"El valor introducido en el campo de peso no puede ser negativo, y debe de estar dentro del intervalo (10,500]");
	}


	@Test // Cuarto
	@DisplayName("Test entrada introducida en el campo de altura BMR")
	public void testAlturaBMR() {
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(70, -3, 'M', 30), 	"El valor introducido en el campo de altura no puede salir del intervalo establecido (10,250]");
	}

	@Test //Quinto
	@DisplayName("Test hombre promedio BMR")
	public void testHombreBMR() throws Exception{

		float BMR = (float) (10 * 15 + 6.25 * 150 - 5 * 10 + 5);
		assertEquals(BMR, c.basalMetabolicRate(15, 150, 'M', 10));

		BMR = (float) (10 * 50 + 6.25 * 170 - 5 * 25 + 5);
		assertEquals(BMR, c.basalMetabolicRate(50, 170, 'M', 25));

		BMR = (float) (10 * 80 + 6.25 * 170 - 5 * 60 + 5);
		assertEquals(BMR, c.basalMetabolicRate(80, 170, 'M', 60));
	}

	@Test //Sexto
	@DisplayName("Test mujer promedio BMR")
	public void testMujerBMR() throws Exception{

		float BMR = (float) (10 * 15 + 6.25 * 150 - 5 * 10 -161);
		assertEquals(BMR, c.basalMetabolicRate(15, 150, 'w', 10));

		BMR = (float) (10 * 50 + 6.25 * 170 - 5 * 25 -161);
		assertEquals(BMR, c.basalMetabolicRate(50, 170, 'w', 25));

		BMR = (float) (10 * 80 + 6.25 * 170 - 5 * 60 -161);
		assertEquals(BMR, c.basalMetabolicRate(80, 170, 'w', 60));
	}







}

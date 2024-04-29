package healthcalc;

import java.awt.EventQueue;

import principal.HealthCalcImpl;

public class Prueba {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl healthCalc = new HealthCalcImpl();
					Vista_Calculadora vista = new Vista_Calculadora();
				    Controlador_Calculadora controlador = new Controlador_Calculadora(healthCalc, vista);
					vista.registrarControlador(controlador);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
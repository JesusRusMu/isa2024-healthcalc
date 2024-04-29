package healthcalc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import principal.HealthCalcImpl;

public class Controlador_Calculadora implements ActionListener {
    
    private HealthCalcImpl calculator;
    private Vista_Calculadora vista;
    private int age= 0;
    private char gender = 'f';
    private int height = 0;
    private float weight = 0;
    

    public Controlador_Calculadora(HealthCalcImpl c, Vista_Calculadora v) {
        this.calculator = c;
        this.vista = v;
        this.vista.registrarControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        String command = e.getActionCommand();

        switch (command) {
            
            case "femaleButton":
                gender = 'w';
                break;

            case "maleButton":
                gender = 'm';
                break;

            
            case "getIdealW":
                try {
                    String texto = vista.getHeightValue().getText();
                    height = Integer.parseInt(texto);

                    try {
                        float idealWeight = calculator.idealWeight(height, gender);
                        vista.setIdealWResults(idealWeight);
                    } catch (Exception ex) {
                        vista.invalidInputsIdealWError(ex.getMessage());
                    }

                } catch (NumberFormatException ex) {
                    vista.noInputsErr();
                }
                break;

            case "getBMR":
                try {
                    String texto = vista.getHeightValue().getText();
                    height = Integer.parseInt(texto);
                    
                    String texto2 = vista.getWeightValue().getText();
                    weight = Float.parseFloat(texto2);
                    
                    String texto3 = vista.getAgeValue().getText();
                    age = Integer.parseInt(texto3);

                    try {
                        float bmr = calculator.basalMetabolicRate(weight, height, gender, age);
                        vista.setBMRResults(bmr);
                    } catch (Exception ex) {
                        vista.invalidInputsBMR(ex.getMessage());
                    }
                } catch (NumberFormatException ex) {
                    vista.noInputsErr();
                }
                break;

        }
    }
}
